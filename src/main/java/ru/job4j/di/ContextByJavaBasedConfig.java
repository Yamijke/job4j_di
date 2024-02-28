package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di");
        var ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
