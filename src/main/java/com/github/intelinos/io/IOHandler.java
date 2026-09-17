package com.github.intelinos.io;

import com.github.intelinos.calendar.CalendarData;
import com.github.intelinos.calendar.CalendarGenerator;
import com.github.intelinos.calendar.CalendarPrinter;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOHandler {

    public boolean invoke(Scanner scanner) throws Exception{
        System.out.print("Введите год (после 1600 года): ");
        String input;

        try {
            input = scanner.nextLine().trim();
        } catch (NoSuchElementException e) {
            System.out.println("\nВыход..."); // для корректного вывода при нажатии Ctrl+C
            return false;
        }

        int year;

        try {
            year = Integer.parseInt(input);
        } catch( NumberFormatException e) {
            throw new Exception("Введено не число.");
        }

        if (year <= 1600){
            throw new Exception("Год должен быть больше 1600.");
        }

        CalendarGenerator generator = new CalendarGenerator();
        CalendarData calendarData = generator.generate(year);

        CalendarPrinter printer = new CalendarPrinter();
        printer.print(calendarData);
        return true;
    }

}
