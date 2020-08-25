package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = allSales(proceeds);
        System.out.println("Сумма всех продаж: " + sum + " руб.;");

        int average = averageSales(proceeds);
        System.out.println("Средняя сумма продаж в месяц: " + average + " руб.;");

        int monthMax = peakSales(proceeds);
        System.out.println("Месяц с максимальными продажами: " + monthMax + ";");

        int monthMin = minimumSales(proceeds);
        System.out.println("Месяц с минимальными продажами: " + monthMin + ";");

        int overAverage = salesBelowAverage(proceeds);
        System.out.println("Количество месяцев с продажами выше среднего: " + overAverage + ";");

        int underAverage = salesAboveAverage(proceeds);
        System.out.println("Количество месяцев с продажами ниже среднего: " + underAverage + ";");
    }


    public static int allSales(int[] proceeds) {
        int sum = 0;
        for (int proceed : proceeds) {
            sum += proceed;
        }
        return sum;
    }

    public static int averageSales(int[] proceeds) {
        int proceedsAverage = allSales(proceeds) / proceeds.length;
        return proceedsAverage;
    }

    public static int peakSales(int[] proceeds) {
        int proceedsMax = proceeds[0];
        int month = 0;
        int monthMax = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMax <= proceed) {
                proceedsMax = proceed;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public static int minimumSales(int[] proceeds) {
        int proceedsMin = proceeds[0];
        int month = 0;
        int monthMin = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMin >= proceed) {
                proceedsMin = proceed;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public static int salesBelowAverage(int[] proceeds) {
        int proceedsAverage = averageSales(proceeds);
        int count = 0;
        int overAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage < proceed) {
                count++;
                overAverage = count;
            }
        }
        return overAverage;
    }

    public static int salesAboveAverage(int[] proceeds) {
        int proceedsAverage = averageSales(proceeds);
        int count = 0;
        int underAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage > proceed) {
                count++;
                underAverage = count;
            }
        }
        return underAverage;
    }
}
