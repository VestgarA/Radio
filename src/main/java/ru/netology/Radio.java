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
            // radioChanel = 9;
            return;
        }
        if (newRadioChanel > 9) {
            // radioChanel = 0;
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

    public void next() {

        if (radioChanel < 9) {
            radioChanel++;
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
