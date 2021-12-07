package my.tx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MultiAppender multiAppender = context.getBean(MultiAppender.class);
        multiAppender.append3();
    }

}
