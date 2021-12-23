package my.spring.tx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-tx-demo.xml");
//        DataAppender appender = context.getBean(DataAppender.class);
//        appender.append("YA");

        MultiAppender appender = context.getBean(MultiAppender.class);
        appender.append3();
    }



}
