package ru.job4j.di;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        ConsoleInput consoleInput = new ConsoleInput();
        StartUI ui = new StartUI(store, consoleInput);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
