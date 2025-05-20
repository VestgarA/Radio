package ru.netology;

import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void minVolume() {

        radio.setRadioVolume(0);

        Assertions.assertEquals(0, radio.getRadioVolume());
    }

    @Test
    public void decreaseMinVolume() {

        radio.setRadioVolume(-1);

        Assertions.assertEquals(0, radio.getRadioVolume());
    }

    @Test
    public void increaseMaxVolume() {

        radio.setRadioVolume(101);

        Assertions.assertEquals(0, radio.getRadioVolume());
    }

    @Test
    public void maxVolume() {

        radio.setRadioVolume(100);
        radio.maxVolume();

        Assertions.assertEquals(100, radio.getRadioVolume());
    }

    @Test
    public void increaseVolume() {

        radio.setRadioVolume(50);
        radio.increaseVolume();

        Assertions.assertEquals(51, radio.getRadioVolume());
    }

    @Test
    public void decreaseVolume() {

        radio.setRadioVolume(50);
        radio.decreaseVolume();

        Assertions.assertEquals(49, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesVolumeMax() {

        radio.setRadioVolume(98);
        radio.increaseVolume();

        Assertions.assertEquals(99, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesVolumeMax2() {

        radio.setRadioVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesVolumeMin() {

        radio.setRadioVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesVolumeMin2() {

        radio.setRadioVolume(1);
        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesMaxVolume() {

        radio.setRadioVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getRadioVolume());
    }

    @Test
    public void boundaryValuesDecreaseVolume() {

        radio.setRadioVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getRadioVolume());
    }

    @Test
    public void minChanel() {

        radio.setRadioChanel(0);

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void decreaseMinChanel() {

        radio.setRadioChanel(-1);

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void maxChanel() {

        radio.setRadioChanel(9);

        Assertions.assertEquals(9, radio.getRadioChanel());
    }

    @Test
    public void increaseMaxChanel() {

        radio.setRadioChanel(10);

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void choiceRadioChanel() {

        radio.setRadioChanel(5);

        Assertions.assertEquals(5, radio.getRadioChanel());
    }

    @Test
    public void nextRadioChanel() {

        radio.setRadioChanel(5);
        radio.next();

        Assertions.assertEquals(6, radio.getRadioChanel());
    }

    @Test
    public void increaseMaxRadioChanel() {

        radio.setRadioChanel(9);
        radio.next();

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void prevRadioChanel() {

        radio.setRadioChanel(5);
        radio.prev();

        Assertions.assertEquals(4, radio.getRadioChanel());
    }

    @Test
    public void prevRadioChanelMin() {

        radio.setRadioChanel(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getRadioChanel());
    }
}