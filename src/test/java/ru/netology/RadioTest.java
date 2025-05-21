package ru.netology;

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
        Radio radio = new Radio(30);

        radio.setRadioChanel(-1);

        Assertions.assertEquals(29, radio.getMaxRadioChanel());
    }

    @Test
    public void maxChanel() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(30);

        Assertions.assertEquals(29, radio.getMaxRadioChanel());
    }

    @Test
    public void increaseMaxChanel() {
        Radio radio = new Radio(20);

        radio.setRadioChanel(19);
        radio.next();

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void choiceRadioChanel() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(5);

        Assertions.assertEquals(5, radio.getRadioChanel());
    }

    @Test
    public void nextRadioChanel() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(15);
        radio.next();

        Assertions.assertEquals(16, radio.getRadioChanel());
    }

    @Test
    public void increaseMaxRadioChanel() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(29);
        radio.next();

        Assertions.assertEquals(0, radio.getRadioChanel());
    }

    @Test
    public void prevRadioChanel() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(20);
        radio.prev();

        Assertions.assertEquals(19, radio.getRadioChanel());
    }

    @Test
    public void prevRadioChanelMin() {
        Radio radio = new Radio(30);

        radio.setRadioChanel(0);
        radio.prev();

        Assertions.assertEquals(29, radio.getRadioChanel());
    }
}