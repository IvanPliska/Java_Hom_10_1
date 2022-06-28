package ru.netology.javaqa38.Homework_10_1.RadioServise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    // Тесты для радиостанции
    @Test // выбор радиостанции пользователем

    public void setNumberRadioStation() {
        radio.setNumberRadioStations(5);

        int expected = 5;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор станции если она больше 9 ти

    public void showIfMaxNumberRadioStation() {
        radio.setNumberRadioStations(10);

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);

    }

    @Test // тест на выбор следующей радиостанции

    public void showNextNumberRadioStation() {
        radio.setNumberRadioStations(5);

        radio.nextNumberRadioStation();

        int expected = 6;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции после 9-ой

    public void showNextNumberRadioStationIfMax() {
        radio.setNumberRadioStations(9);

        radio.nextNumberRadioStation();

        int expected = 0;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // Тест на выбор радиостанции если она отрицательная

    public void showNextNumberRadioStationIfMoreMin() {
        radio.setNumberRadioStations(-1);

        radio.nextNumberRadioStation();

        int expected = 1;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор предыдущей радиостанции

    public void showPrevNumberRadioStations() {
        radio.setNumberRadioStations(4);

        radio.prevNumberRadioStation();

        int expected = 3;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции меньше нуля

    public void showPrevNumberRadioStationIfMin() {
        radio.setNumberRadioStations(-1);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции перед 0-ой

    public void showPrevNumberRadioStationIfZero() {
        radio.setNumberRadioStations(0);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    @Test // тест на выбор радиостанции равной 10 ти

    public void showPrevNumberRadioStationIfMoreMin() {
        radio.setNumberRadioStations(10);

        radio.prevNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStations();

        assertEquals(expected, actual);
    }

    // Тесты для громкости:

    @Test // выбор громкости в пределах допустимой

    public void showSetVolume() {
        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // выход за нижнюю границу громкости

    public void setVolumeDown() {
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // выход за верхнюю границу громкости

    public void setVolumeUp() {
        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увелечения громкости в возможных пределах

    public void showNextVolume() {
        radio.setVolume(5);

        radio.nextVolume();

        int expected = 6;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увелечения громкости если уже было 10

    public void showNextVolumeIfMax() {
        radio.setVolume(100);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увеличения громкости если для значения более 10 ти

    public void showNextVolumeIfMoreMax() {
        radio.setVolume(101);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест увеличения громкости если для значения более 10 ти

    public void showNextVolumeIfZero() {
        radio.setVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости в возможных пределах

    public void showPrevVolume() {
        radio.setVolume(5);

        radio.prevVolume();

        int expected = 4;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости если уже было 0

    public void showPrevVolumeIfMin() {
        radio.setVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test // тест уменьшения громкости превышающий границу минимальной громкости

    public void showPrevVolumeIfMinMore() {
        radio.setVolume(-2);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    // тест на колличество станций
    @Test
    public void showStationCount () {
        Radio radio = new Radio(20);
        radio.setNumberRadioStations(15);

        assertEquals(15,radio.getNumberRadioStations());

    }
}