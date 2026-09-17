package com.github.intelinos.calendar;

import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarGenerator {

    public CalendarData generate(int year) {
        CalendarData data = new CalendarData();
        data.setYear(year);
        Month[] months = data.getMonths();
        for (int i = 0; i < months.length; i++) {
            months[i] = new Month();
            Week[] weeks = months[i].getWeeks();

            for (int k = 0; k < weeks.length; k++) {
                weeks[k] = new Week();
            }

            int weekIndx = 0;
            int dowIndx = LocalDate.of(year, i + 1, 1).getDayOfWeek().getValue() - 1; // dow stands for Day Of Week
            int totalDays = YearMonth.of(year, i + 1).lengthOfMonth();
            for (int j = 1; j <= totalDays; j++) {
                weeks[weekIndx].getDays()[dowIndx] = j;
                dowIndx++;
                if (dowIndx > 6) {
                    dowIndx = 0;
                    weekIndx++;
                }
            }
        }
        return data;
    }

}
