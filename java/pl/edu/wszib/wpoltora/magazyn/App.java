package pl.edu.wszib.wpoltora.magazyn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.wpoltora.magazyn.gui.IGUI;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        IGUI gui = context.getBean(IGUI.class);
        gui.showMainMenu();
    }

}
