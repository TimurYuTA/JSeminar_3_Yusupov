package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {


    @Test
    void removeNegativeValue() {
        // исходное
        List<Integer> expectedlist = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 4, 7, 2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 9, 7));

        // делаем
        Homework homework = new Homework();
        List<Integer> actual = homework.removeNegativeValue(expectedlist);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMin() {
        // исходное
        List<Integer> expectedlist = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 4, 7, 2));
        int expected = 1;

        // делаем
        Homework homework = new Homework();
        int actual = homework.getMin(expectedlist);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxSuccessful() {
        // исходное
        List<Integer> expectedlist = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 4, 7, 2));
        int expected = 9;

        // делаем
        Homework homework = new Homework();
        int actual = homework.getMax(expectedlist);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverage() {
        // исходное
        List<Integer> expectedlist = new ArrayList<>(Arrays.asList(1, 3, 8, 9, 4, 7, 2));
        int expected = 17;

        // делаем
        Homework homework = new Homework();
        int actual = homework.getAverage(expectedlist);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }
}