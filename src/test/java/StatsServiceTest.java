import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void theSumOfAllSales(String line) {
        StatsService service = new StatsService();
        //конвертируем строку в int
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.allSales(resources);

        int expected = 180;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void averageSalesAmountPerMonth(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.averageSales(resources);

        int expected = 15;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void peakSales(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.peakSales(resources);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void minimumSales(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.minimumSales(resources);

        int expected = 9;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void NumberOfMonthsBelowAverage(String line) {
        StatsService service = new StatsService();
        int[] resouces = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.SalesBelowAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void NumberOfMonthsAboveAverage(String line) {
        StatsService service = new StatsService();
        int[] resouces = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.SalesAboveAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }
}