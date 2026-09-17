package com.github.intelinos;

import com.github.intelinos.io.IOHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IOHandler handler = new IOHandler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                boolean running = handler.invoke(scanner);
                if (!running) {                             // для корректного вывода при нажатии Ctrl+C
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        }
    }
}