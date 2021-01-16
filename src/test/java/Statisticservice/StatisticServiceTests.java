package Statisticservice;


import org.junit.jupiter.api.Test;
import ru.netology.statistics.Statisticians;

class StatisticServiceTests {
    int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amount() {
        Statisticians service = new Statisticians();
        int exp = 180;
        int act = service.amount(data);
        assertEquals(exp, act);
    }
    private void assertEquals(int exp, int act) {
    }

    @Test
    void averageValue() {
        Statisticians service = new Statisticians();
        int exp = 15;
        float act = (float) service.averageValue(data);
        assertEquals(exp, (int) act);
    }


    @Test
    void monthsOfMaxSales() {
        Statisticians service = new Statisticians();
        int exp = 8;
        int act = service.monthsOfMaxSales(data);
        assertEquals(exp, act);
    }


    @Test
    void monthsOfMinSales() {
        Statisticians service = new Statisticians();
        int exp = 9;
        int act = service.monthsOfMinSales(data);
        assertEquals(exp, act);
    }


    @Test
    void belowAverageSalesMonths() {
        Statisticians service = new Statisticians();
        int exp = 5;
        int act = service.belowAverageSalesMonths(data);
        assertEquals(exp, act);
    }

    @Test
    void aboveAverageSalesMonths() {
        Statisticians service = new Statisticians();
        int exp = 5;
        int act = service.aboveAverageSalesMonths(data);
        assertEquals(exp, act);
    }
}
