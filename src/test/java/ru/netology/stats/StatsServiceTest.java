package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calculateMaxSales(sales);
        long expected = 180;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calculateAverageSales(sales);
        long expected = 15;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testMonthOfSalesPeak() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.getMonthOfSalesPeak(sales);
        long expected = 7;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testMonthOfMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.getMonthOfMinSales(sales);
        long expected = 8;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calculateBelowAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testUnderAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calculateUnderAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(actual,expected);
    }
}