package my.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Calc calc = context.getBean(Calc.class);
        System.out.println(calc.plus(1.0,2.0));
    }

}
