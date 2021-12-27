package my.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("spring-config.xml");
        Calc calc = context.getBean(Calc.class);
        System.out.println("Result: " + calc.plus(1,2));
        System.out.println("Result: " + calc.minus(1,2));
        System.out.println(calc.getClass().toString());
    }
}
