package ru.netology.javaqa38.Homework_10_1.RadioServise;

public class Radio {
    // Параметры:
    private int numberRadioStations;
    private int volume;

    // Сеттеры:

    public void setNumberRadioStations(int newNumberRadioStations) {
        if (newNumberRadioStations < -1) {
            return;
        }
        if (newNumberRadioStations > 10) {
            return;
        }
        numberRadioStations = newNumberRadioStations;
    }

    public void setVolume(int newVolume) {
        if (newVolume < -1) {
            return;
        }
        if (newVolume > 11) {
            return;
        }
        volume = newVolume;
    }


    // Геттеры:
    public int getNumberRadioStations() {
        if (numberRadioStations == -1) {
            return numberRadioStations = 9;
        }
        if (numberRadioStations == 10) {
            return numberRadioStations = 0;
        } else {
            return numberRadioStations;
        }
    }

    public int getVolume() {
        if (volume == -1) {
            return volume = 0;
        }
        if (volume == 11) {
            return volume = 10;
        } else {
            return volume;
        }
    }

    // Методы для проверки каналов радиостанции:

    public void nextNumberRadioStation() {
        if (numberRadioStations > -1) {
            if (numberRadioStations < 10) {
                int next = numberRadioStations + 1;
                setNumberRadioStations(next);
            }
        }
    }

    public void prevNumberRadioStation() {
        if (numberRadioStations > -1) {
            if (numberRadioStations < 10) {
                int prev = numberRadioStations - 1;
                setNumberRadioStations(prev);
            }
        }
    }

    //  Методы для проверки громкости:
    public void nextVolume() {
        if (volume > 0) {
            if (volume < 11) {
                int next = volume + 1;
                setVolume(next);
            }
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            if (volume < 11) {
                int next = volume - 1;
                setVolume(next);
            }
        }
    }
}