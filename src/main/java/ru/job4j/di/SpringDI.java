package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.model.ConsoleInput;
import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add(ui.askInput("Enter name:  "));
        ui.print();
    }
}
