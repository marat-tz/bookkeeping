package org.petproject.bookkeeping.system;

import org.petproject.bookkeeping.system.action.AllListingAction;
import org.petproject.bookkeeping.system.menu.ConsoleMenu;

public class BookkeepingSystemApplication {
    public static void main(String[] args) {
        ConsoleMenu.printGeneralMenu();
        Long command = ConsoleMenu.readLong("Введите команду: ");
        if (command != null && command == 1) {
            new AllListingAction().doAction();
        } else {
            System.out.println("Неверная команда");
        }
    }
}
