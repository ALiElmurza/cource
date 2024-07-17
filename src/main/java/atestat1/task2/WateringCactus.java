package atestat1.task2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.now;

public class WateringCactus {
    private static LocalDate lastToWater;


    public static void main(String[] args) {
        // последний полив
        lastToWater = now().minusDays(0);

        LocalDate dateToWater = whenToWaterCactus(lastToWater, Sensor.moisture());

        System.out.println("Необходимая дата полива: " + dateToWater + " (гггг-мм-дд)");


    }

    private static LocalDate whenToWaterCactus(LocalDate lastToWater, Integer sensorValue){
        LocalDate now = now();

        if (lastToWater == null) {
            now = now();
            lastToWater = now;
            return now;
        } else {
            String season = getSeason(now());
            switch (season) {
                case "Winter":
                    int month = getPeriodMonth(lastToWater, now());
                    if (month > 1) {
                        now = now();
                        lastToWater = now;
                        return now;
                    } else {
                        now = now.plusMonths(1);
                    }
                    break;
                case "Spring":
                case "Fall":
                    long weeks = getPeriodWeeks(lastToWater, now());
                    if (weeks > 1) {
                        now = now();
                        lastToWater = now;
                        return now;
                    } else {
                        now = now.plusWeeks(1);
                    }
                    break;
                case "Summer":
                    long days = getPeriodDays(lastToWater, now());
                    if (days > 2 && sensorValue < 30) {
                        now = now();
                        lastToWater = now;
                        return now;
                    } else if (days == 2) {
                        now = now.plusMonths(1);
                    } else if (days == 1) {
                        now = now.plusMonths(2);
                    } else if (days == 0) {
                        now = now.plusMonths(3);
                    }
                    break;
                default:
                    throw new RuntimeException("Unknown error");
            }
        }
        return now;
    }

    private static String getSeason(LocalDate today) {
        Month currentMonth = today.getMonth();

        String season;

        switch (currentMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = "Winter";
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season = "Spring";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = "Summer";
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = "Fall";
                break;
            default:
                season = "Unknown";
                break;
        }
        return season;
    }

    private static int getPeriodMonth(LocalDate start, LocalDate end) {
        Period period = Period.between(start, end);
        return period.getYears() * 12 + period.getMonths();
    }
    private static long getPeriodWeeks(LocalDate start, LocalDate end) {
        return ChronoUnit.WEEKS.between(start, end);
    }

    private static long getPeriodDays(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }

}
