package my.animals1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        //Типичная ситуация: внеконтекстный код мизерный или редуцированный:
        // его задача - собрать контекст и нажать на "спусковой крючок"
        Process process;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");
        process = context.getBean(Process.class);
        process.start();
    }
}

//1. Добавьте к нам в приложение бизнес процесс WalkProcess (Прогулка).
// Должен появиться текст "гуляем", а жмотное трижды радостно подать голос
//2. При страте прлиожения происходит прогулка. (12:10)
