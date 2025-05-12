package ru.netology;

import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RadioChanel() {
        Radio radio = new Radio();
        radio.radioChanel = 5;

        int expectedChanel = 5;
        int actualChanel = radio.getRadioChanel();

        Assertions.assertEquals(expectedChanel, actualChanel);
    }

    @Test
    public void switchingStations() {
        Radio radio = new Radio();
        radio.setRadioChanel(5);

        int expectedChanel = 6;
        int actualChanal = radio.getRadioChanel();

        Assertions.assertEquals(expectedChanel, actualChanal);
    }

    @Test
    public void chanelMoreMax() {
        Radio radio = new Radio();
        radio.setRadioChanel(10);

        int expectedChanel = 0;
        int actualChanel = radio.getRadioChanel();

        Assertions.assertEquals(expectedChanel, actualChanel);
    }

    @Test
    public void maxRadioChanel() {
        Radio radio = new Radio();
        radio.maxRadioChanel();

        int expectedChanel = 9;
        int actualChanel = radio.getRadioChanel();

        Assertions.assertEquals(expectedChanel, actualChanel);
    }

    @Test
    public void radioVolume() {
        Radio volume = new Radio();
        volume.radioVolume = 50;

        int expectedVolume = 50;
        int actualVolume = volume.getRadioVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void soundLessVolume() {
        Radio volume = new Radio();
        volume.setRadioVolume(-1);

        int expectedVolume = 0;
        int actualVolume = volume.getRadioVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void soundMaxVolume() {
        Radio volume = new Radio();
        volume.maxRadioVolume();

        int expectedVolume = 100;
        int actualVolume = volume.getRadioVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void soundMoreVolume() {
        Radio volume = new Radio();
        volume.setRadioVolume(50);

        int expectedVolume = 51;
        int actualVolume = volume.getRadioVolume();

        Assertions.assertEquals(expectedVolume, actualVolume);
    }

}
