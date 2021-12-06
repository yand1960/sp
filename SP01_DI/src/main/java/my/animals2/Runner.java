package my.animals2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        //Типичная ситуация: внеконтекстный код мизерный или редуцированный:
        // его задача - собрать контекст и нажать на "спусковой крючок"
        Process process1, process2;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
        //process = context.getBean(Process.class);
        //process = context.getBean(WalkProcess.class);
        process1 = context.getBean("process1", Process.class);
        process2 = context.getBean("process2", Process.class);
        process1.start();
        process2.start();
    }
}

