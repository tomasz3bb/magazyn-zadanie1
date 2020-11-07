package pl.edu.wszib.magazyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.magazyn.gui.GUI;

public class App {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfiguration.class).getBean(GUI.class).showMainMenu();
    }
}
