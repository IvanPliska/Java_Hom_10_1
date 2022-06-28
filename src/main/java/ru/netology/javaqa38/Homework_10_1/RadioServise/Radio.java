package ru.netology.javaqa38.Homework_10_1.RadioServise;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    // Параметры:

    private int numberRadioStations;
    private int volume;
    private int maxNumberRadioStation = 9;
    private int maxVolume = 100;

    // Конструкторы:

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
        if (volume < maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
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
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        this.volume = volume;
    }
}
