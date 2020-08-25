package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void allSales() {
        StatsService service = new StatsService();
        int[] resources = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.allSales(resources);

        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        int[] resources = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSales(resources);

        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void peakSales() {
        StatsService service = new StatsService();
        int[] resources = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.peakSales(resources);

        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void minimumSales() {
        StatsService service = new StatsService();
        int[] resources = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minimumSales(resources);

        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] resouces = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.salesBelowAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void salesAboveAverage() {
        StatsService service = new StatsService();
        int[] resouces = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.salesAboveAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }
}