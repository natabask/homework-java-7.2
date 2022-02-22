package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxIncreasingIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 15, 18, 24, 35, 43, 58, 66, 111, 211, 312};
        long expected = 312;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}