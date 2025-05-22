package ru.netology;

public class Radio {
    private int radioVolume;
    private int radioChanel = 10;
    private int maxRadioStations;

    public Radio(int settingNumberRadioStations) {
        this.maxRadioStations = settingNumberRadioStations - 1;
    }

    public Radio() {

    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public int getRadioChanel() {
        return radioChanel;
    }

    public int getMaxRadioChanel() {
        return maxRadioStations;
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
        if (newRadioChanel > maxRadioStations) {
            return;
        }
        radioChanel = newRadioChanel;
    }

    public void increaseVolume() {

        if (radioVolume != 100) {
            radioVolume++;
        }
    }

    public void decreaseVolume() {
        if (radioVolume != 0) {
            radioVolume--;
        }
    }

    public void maxVolume() {
        radioVolume = 100;
    }

    public void next() {
        if (radioChanel != maxRadioStations) {
            radioChanel++;
        } else {
            radioChanel = 0;
        }
    }

    public void prev() {
        if (radioChanel != 0) {
            radioChanel--;
        } else {
            radioChanel = maxRadioStations;
        }
    }
}