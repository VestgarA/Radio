package ru.netology;

public class Radio {
    public int radioChanel;

    public int getRadioChanel() {
        return radioChanel;
    }

    public void setRadioChanel(int newRadioChanel) {
        radioChanel = newRadioChanel;
        if (newRadioChanel < 9) {
            radioChanel++;

            return;
        }
        if (newRadioChanel > 9) {
            radioChanel = 0;
            return;
        }
    }

    public void maxRadioChanel() {
        radioChanel = 9;
    }

    public int radioVolume;

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {
        radioVolume = newRadioVolume;
        if (newRadioVolume < 0) {
            radioVolume = 0;
            return;
        }

        if (newRadioVolume < 100) {
            radioVolume ++;
            return;
        }

    }

    public void maxRadioVolume() {
        radioVolume = 100;
    }
}
