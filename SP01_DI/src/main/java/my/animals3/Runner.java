package my.animals3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {

        Process process;
        ApplicationContext context = new AnnotationConfigApplicationContext(
                MySpringConfiguration.class
        );

//        Animal animal = context.getBean("animal1",Animal.class);
//        animal.eat();
        Process process1 = context.getBean("process1", Process.class);
        process1.start();
        Process process2 = context.getBean("process2", Process.class);
        process2.start();


    }
}
