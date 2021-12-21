package my.spring.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {


    //Типичное назначение внетконтекстного кода - собрать контекст
    // и "нажать на спусковой крчюок"
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
        Process process = context.getBean(Process.class);
        process.run();
    }
}
