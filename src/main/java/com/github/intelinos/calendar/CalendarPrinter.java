package com.github.intelinos.calendar;

public class CalendarPrinter {

    public void print(CalendarData data) {
        Month[] months = data.getMonths();
        int year = data.getYear();
        String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май",
                "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        for (int i = 0; i < months.length; i++) {
            System.out.println("\n    " + monthNames[i] + " " + year + "    ");
            System.out.println("Пн Вт Ср Чт Пт Сб Вс");
            for (Week week : months[i].getWeeks()) {
                for (Integer day : week.getDays()) {
                    if (day == null) {
                        System.out.print("   ");
                    } else {
                        System.out.printf("%2d ", day); // чтобы число занимало ровно 2 места
                    }
                }
                System.out.println();
            }
        }
    }

}
