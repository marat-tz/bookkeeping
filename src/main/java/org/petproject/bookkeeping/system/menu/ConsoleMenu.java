package org.petproject.bookkeeping.system.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu {

    private static final BufferedReader CONSOLE_READER = new BufferedReader(new InputStreamReader(System.in));

    private ConsoleMenu() {}

    public static void printGeneralMenu() {
        System.out.println("--------------------");
        System.out.println("1. Показать все записи");
    }

    public static Long readLong(String message) {
        System.out.println(message);

        try {
            return Long.parseLong(CONSOLE_READER.readLine());
        } catch (Exception ex) {
            return null;
        }

    }

}
