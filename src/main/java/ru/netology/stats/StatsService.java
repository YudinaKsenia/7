package ru.netology.stats;

public class StatsService {
    public long calculateMaxSales(long[] sales) {
        long maxSales = 0;
        for (long sale : sales) {
            maxSales = maxSales + sale;
        }
        return maxSales;
    }

    public long calculateAverageSales(long[] sales) {
        long maxSales = calculateMaxSales(sales);
        long averageSales = maxSales / 12;
        return averageSales;
    }

    public int getMonthOfSalesPeak(long[] sales) {
        int monthOfSalesPeak = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= sales[monthOfSalesPeak]) {
                monthOfSalesPeak = i;
            }
        }
        return monthOfSalesPeak;
    }

    public int getMonthOfMinSales(long[] sales) {
        int monthOfMinSales = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] <= sales[monthOfMinSales]) {
               monthOfMinSales = i;
            }
        }
        return monthOfMinSales;
    }

    public int calculateBelowAverageSales(long[] sales) {
        int belowAverageSales = 0;
        long averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    public int calculateUnderAverageSales(long[] sales) {
        int underAverageSales = 0;
        long averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                underAverageSales++;
            }
        }
        return underAverageSales;
    }
}