package ru.netology;

import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void settingVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setRadioVolume(101);

        radio.maxVolume();

        int expected = 100;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(0);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioChanelAboveMax() {
        Radio radio = new Radio();

        radio.setRadioChanel(10);

        int expected = 0;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installingStationFromRemoteControl() {
        Radio radio = new Radio();

        radio.setRadioChanel(5);

        int expected = 5;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void settingStationAboveMaximum() {
        Radio radio = new Radio();

        radio.setRadioChanel(9);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStation() {
        Radio radio = new Radio();

        radio.setRadioChanel(6);
        radio.nextChanel();

        int expected = 7;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRadioStation() {
        Radio radio = new Radio();

        radio.setRadioChanel(9);
        radio.nextChanel();

        int expected = 9;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousChannel() {
        Radio radio = new Radio();

        radio.setRadioChanel(4);
        radio.switchingPreviousStation();

        int expected = 3;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousChannelMin() {
        Radio radio = new Radio();

        radio.setRadioChanel(-1);

        int expected = 9;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumRadioChanel(){
        Radio radio = new Radio();

        radio.setRadioChanel(0);
        radio.switchingPreviousStation();

        int expected = 0;
        int actual = radio.getRadioChanel();

        Assertions.assertEquals(expected, actual);
    }
}