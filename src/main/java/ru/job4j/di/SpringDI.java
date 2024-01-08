package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.StartUI;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di.model");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add(ui.askInput("Enter name:  "));
        ui.print();
    }
}
