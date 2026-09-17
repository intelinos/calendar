package com.github.intelinos.calendar;

public class Month {
    private Week[] weeks = new Week[6];

    public Week[] getWeeks() {
        return weeks;
    }

    public void setWeeks(Week[] weeks) {
        this.weeks = weeks;
    }
}
