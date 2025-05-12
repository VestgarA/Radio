package ru.netology;

import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void volumeMoreMax() {
        Radio radio = new Radio();

        radio.setRadioVolume(101);

        int expectedVolum = 100;
        int actualVolume = radio.getRadioVolume();

        Assertions.assertEquals(expectedVolum, actualVolume);
    }

    @Test
    public void volumeLessMin() {
        Radio radio = new Radio();

        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(50);

        int expected = 51;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingChanel() {
        Radio radio = new Radio();

        radio.setRadioChanel(5);

        int expected = 6;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chanelMoremax() {
        Radio radio = new Radio();

        radio.setRadioChanel(10);

        int expected = 1;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chanelLessMin() {
        Radio radio = new Radio();

        radio.setRadioChanel(-1);

        int expected = 9;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRadioChanel() {
        Radio radio = new Radio();

        radio.setRadioChanel(9);

        int expected = 0;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }
}