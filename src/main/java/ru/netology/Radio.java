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
        if (radioVolume < 100) {
            radioVolume++;
        }
    }

    public void maxVolume() {
        radioVolume = 100;
    }

    public void nextChanel() {

        if (radioChanel < 9) {
            radioChanel++;
        }
    }
}
