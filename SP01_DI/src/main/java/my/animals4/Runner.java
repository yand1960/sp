package my.animals4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        //Типичная ситуация: внеконтекстный код мизерный или редуцированный:
        // его задача - собрать контекст и нажать на "спусковой крючок"
        Process process;
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config4.xml");
        process = context.getBean(Process.class);
        process.start();
    }
}


