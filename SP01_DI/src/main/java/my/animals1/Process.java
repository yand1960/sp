package my.animals1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Process {

    public static void main(String[] args) {
        //При POJO тесная зависимость неизбежна
//        Animal a = new Cat();
//        a.eat();

        Animal a;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");

        a = context.getBean(Animal.class);
        System.out.println(a.voice());
        a.eat();

    }

}
