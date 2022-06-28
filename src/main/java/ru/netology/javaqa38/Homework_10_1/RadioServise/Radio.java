package ru.netology.javaqa38.Homework_10_1.RadioServise;

public class Radio {
    // Параметры:

    private int numberRadioStations;
    private int volume;
    private int maxNumberRadioStation;

    // Конструкторы:

    public Radio() {
        maxNumberRadioStation = 9;
    }

    public Radio(int countRadioStation) {
        maxNumberRadioStation = countRadioStation - 1;

    }

    // Методы
    public void nextNumberRadioStation() {
        if (numberRadioStations < maxNumberRadioStation) {
            numberRadioStations++;
        } else {
            numberRadioStations = 0;
        }
    }

    public void prevNumberRadioStation() {
        if (numberRadioStations > 0) {
            numberRadioStations--;
        } else {
            numberRadioStations = maxNumberRadioStation;
        }
    }

    public void nextVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
        ;
    }

    public void prevVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }

    // Сеттеры:

    public void setNumberRadioStations(int numberRadioStations) {
        if (numberRadioStations < 0) {
            return;
        }
        if (numberRadioStations > maxNumberRadioStation) {
            return;
        }
        this.numberRadioStations = numberRadioStations;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            volume = 100;
        }
        this.volume = volume;
    }

    // Геттеры:

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public int getVolume() {
        return volume;
    }
}
