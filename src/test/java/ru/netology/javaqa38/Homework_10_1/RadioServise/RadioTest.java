package ru.netology.javaqa38.Homework_10_1.RadioServise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты для радиостанции
    @Test // выбор радиостанции пользователем

    public void setNumberRadioStation() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(5);

        int expected = 5;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор станции если она больше 9 ти

    public void showIfMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStations(10);

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);

    }

    @Test // выбор радиостанции если она больше 10-ти

    public void showIfMoreMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStations(11);

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);

    }

    @Test // тест на выбор следующей радиостанции

    public void showNextNumberRadioStation() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(5);

        radio.nextNumberRadioStation();

        int expected = 6;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции после 9-ой

    public void showNextNumberRadioStationIfMax() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(9);

        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // Тест на выбор радиостанции если она больше 10 ой

    public void showNextNumberRadioStationIfMoreMax() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(10);

        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // Тест на выбор радиостанции если она меньше 0

    public void showNextNumberRadioStationIfZero() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(0);

        radio.nextNumberRadioStation();

        int expected = 1;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // Тест на выбор радиостанции если она отрицательная

    public void showNextNumberRadioStationIfMoreMin() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(-1);

        radio.nextNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор предыдущей радиостанции

    public void showPrevNumberRadioStations() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(4);

        radio.prevNumberRadioStation();

        int expected = 3;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции меньше нуля

    public void showPrevNumberRadioStationIfMin() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(-1);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции меньше -1

    public void showPrevNumberRadioStationIfMinimum() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(-2);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции перед 0-ой

    public void showPrevNumberRadioStationIfZero() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(0);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции равной 10 ти

    public void showPrevNumberRadioStationIfMoreMin() {
        Radio radio = new Radio();
        radio.setNumberRadioStations(10);

        radio.prevNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    // Тесты для громкости:

    @Test // выбор громкости в пределах допустимой

    public void showSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // выход за нижнюю границу громкости

    public void setVolumeDown() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // выход за верхнюю границу громкости

    public void setVolumeUp() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увелечения громкости в возможных пределах

    public void showNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);

        radio.nextVolume();

        int expected = 6;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увелечения громкости если уже было 10

    public void showNextVolumeIfMax() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увеличения громкости если для значения более 10 ти

    public void showNextVolumeIfMoreMax() {
        Radio radio = new Radio();
        radio.setVolume(11);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увеличения громкости если для значения более 10 ти

    public void showNextVolumeIfZero() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.nextVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости в возможных пределах

    public void showPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);

        radio.prevVolume();

        int expected = 4;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости если уже было 0

    public void showPrevVolumeIfMin() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости на границе максимальной громкости

    public void showPrevVolumeIfMaxMore() {
        Radio radio = new Radio();
        radio.setVolume(11);

        radio.prevVolume();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости превышающий границу минимальной громкости

    public void showPrevVolumeIfMinMore() {
        Radio radio = new Radio();
        radio.setVolume(-2);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости превышающий границу максимальной громкости

    public void showPrevVolumeIfMaximum() {
        Radio radio = new Radio();
        radio.setVolume(12);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }
}