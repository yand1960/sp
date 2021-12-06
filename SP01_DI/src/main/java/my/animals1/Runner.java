package my.animals1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        //Типичная ситуация: внеконтекстный код мизерный или редуцированный:
        // его задача - собрать контекст и нажать на "спусковой крючок"
        Process process;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");
        //process = context.getBean(Process.class);
        //process = context.getBean(WalkProcess.class);
        process = context.getBean("process2",Process.class);
        process.start();
    }
}

//1. Добавьте к нам в приложение бизнес процесс WalkProcess (Прогулка).
// Должен появиться текст "гуляем", а животное трижды [радостно] подать голос
//2. При старте приложения происходит прогулка. (12:10)
