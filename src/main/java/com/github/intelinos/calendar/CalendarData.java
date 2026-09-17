package com.github.intelinos.calendar;

public class CalendarData {
    private int year;

    private Month[] months = new Month[12];

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month[] getMonths() {
        return months;
    }

    public void setMonth(Month[] months) {
        this.months = months;
    }
}
