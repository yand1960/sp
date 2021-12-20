package my.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
//    public static void main(String[] args) {
//        //POJO - plain old java object
//        //При таком подходе неизбежна тесная связь
//        Animal animal = new Cat();
//        animal.eat();
//    }

//    public static void main(String[] args) {
//        //Ревлолюция: loosely coupled code.Получен с помощью контеста сприннг,
//        // сконифгурированного с помощью конфигуационного файла. Экземппляры класса,
//        // созданные в контексте называют beans (бобами) Это, однако не типичный
//        // для спринговогоо приложения, поскольку бизнес- процесс реализуется вне контескта
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
////        Animal animal = context.getBean(Animal.class);
//        Animal animal = context.getBean("bobik",Animal.class);
//        System.out.println(animal.getVoice());
//        animal.eat();
//    }

    //Типичное назначение внетконтекстного кода - собрать контекст
    // и "нажать на спусковой крчюок"
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Process process = context.getBean(Process.class);
        process.run();
    }
}
