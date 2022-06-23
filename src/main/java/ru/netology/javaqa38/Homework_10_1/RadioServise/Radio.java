package ru.netology.javaqa38.Homework_10_1.RadioServise;

public class Radio {
    // Параметры для радио-станции
    public int numberRadioStations;

    public int getNumberRadioStations() {
        if (numberRadioStations < 0) {
            return numberRadioStations = 9;
        }
        if (numberRadioStations > 9) {
            return numberRadioStations = 0;
        } else {
            return numberRadioStations;
        }
    }

    public void setNumberRadioStations(int newNumberRadioStations) {
        if (newNumberRadioStations < -1) {
            return;
        }
        if (newNumberRadioStations > 10) {
            return;
        }
        numberRadioStations = newNumberRadioStations;
    }

    public void nextNumberRadioStation() {
        if (numberRadioStations > 0 && numberRadioStations < 10) {
            int next = numberRadioStations + 1;
            setNumberRadioStations(next);
        }
    }

    public void prevNumberRadioStation() {
        if (numberRadioStations > -1 && numberRadioStations < 10) {
            int prev = numberRadioStations - 1;
            setNumberRadioStations(prev);
        }
    }

    // Параметры для громкости
    public int volume;

    public int getVolume() {
        if (volume < 0) {
            return volume = 0;
        }
        if (volume > 10) {
            return volume = 10;
        } else {
            return volume;
        }
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

    public void nextVolume() {
        if (volume > 0 && volume < 11) {
            int next = volume + 1;
            setVolume(next);
        }
    }

    public void prevVolume() {
        if (volume > 0 && volume < 11) {
            int next = volume - 1;
            setVolume(next);
        }
    }
}


