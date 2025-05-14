package ru.netology;

public class Radio {
    private int radioVolume;

    public int getRadioVolume() {
        return radioVolume;
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

    public void IncreaseVolume() {
        if (radioVolume < 100) {
            radioVolume++;
        }
    }

    public void maxVolume() {
        radioVolume = 100;
    }

    private int radioChanel;

    public int getRadioChanel() {
        return radioChanel;
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

    public void increaseChanel() {

        if (radioChanel < 9) {
            radioChanel++;
        }
    }

    public void maxRadioChanel() {
        radioChanel = 9;
    }
}

