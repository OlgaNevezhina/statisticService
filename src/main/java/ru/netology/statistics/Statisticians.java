package ru.netology.statistics;

public class Statisticians { //case 1
    public int amount(int[] data) {
        int totalAmount = 0;
        for (int amount : data) {
            totalAmount += amount;
        }
        return totalAmount;
    }

    public Object averageValue(int[] data) { //case 2
        int amount = 0, month = 1;
        float average = 0;
        for (int ignored : data) {
            amount += average;
            month++;
        }
        average = (float) amount / month;
        return average;
    }


    public int monthsOfMaxSales(int[] data) {   //case 3
        int amount = 0, maxMonth = 1;
        for (int month : data) {
            amount++;
            if (maxMonth <= month) {
                maxMonth= month;
            }
        }

        return amount;
    }

    public int monthsOfMinSales(int[] data) {   //case 4
        int amount = 0, miniMonth = data[0], Month = 1;
        for (int month : data) {
            amount++;
            if (miniMonth >= month) {
                miniMonth = month;
                Month = amount;
            }
        }
        return Month;
    }


    public int belowAverageSalesMonths(int[] data) {    //case 5
        int amount = 0,  months = 1;
        float below;
        for (int average : data) {
            amount += average;
            months++;
        }
        below = (float) amount /months;
        for (int average : data) {
            if (average < below) {
                months++;
            }
        }
        return months;
    }

    public int aboveAverageSalesMonths(int[] data) {  //case 6
        int amount = 0,  months = 1;
        float average;
        for (int above : data) {
            amount += above ;
            months++;
        }
        average = (float) amount / months;
        for (int above  : data) {
            if (above  > average) {
                months++;
            }
        }
        return months;
    }
}
