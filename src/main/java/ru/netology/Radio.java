package ru.netology;

public class Radio {
    public int radioVolume;

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int newRadioVolume) {

        if (newRadioVolume < 0) {
            return;
        }
        if (newRadioVolume > 100) {
            radioVolume = 100;
        }
        if (newRadioVolume < 100) {
            radioVolume = newRadioVolume;
            radioVolume++;
        }
    }

    public int radioChanel;

    public int getRadioChanel() {
        return radioChanel;
    }

    public void setRadioChanel(int newRadioChanel) {
        if (newRadioChanel < 0) {
            radioChanel = 9;
            return;
        }
        if (newRadioChanel > 9) {
            radioChanel = 1;
            return;
        }
        if (newRadioChanel < 9) {
            radioChanel = newRadioChanel;
            radioChanel++;
        }
    }
}
