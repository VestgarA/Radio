package ru.netology;

public class Radio {
    private int radioVolume;
    private int radioChanel;

    public int getRadioVolume() {
        return radioVolume;
    }

    public int getRadioChanel() {
        return radioChanel;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < 0) {
            return;
        }
        if (newRadioVolume > 100) {
            return;
        }
        radioVolume = newRadioVolume;
    }

    public void setRadioChanel(int newRadioChanel) {

        if (newRadioChanel < 0) {
            return;
        }
        if (newRadioChanel > 9) {
            return;
        }
        radioChanel = newRadioChanel;
    }

    public void increaseVolume() {

        if (radioVolume != 100) {
            radioVolume++;
        } else {
            radioVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (radioVolume != 0) {
            radioVolume--;
        } else {
            radioVolume = 0;
        }
    }

    public void maxVolume() {
        radioVolume = 100;
    }

    public void next() {
        if (radioChanel != 9) {
            radioChanel++;
        } else {
            radioChanel = 0;
        }
    }

    public void prev() {
        if (radioChanel > 0) {
            radioChanel--;
        } else {
            radioChanel = 9;
        }
    }
}
