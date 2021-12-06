package my.animals3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfiguration {

    Animal animal1, animal2;
    Process process1, process2;

    public MySpringConfiguration(){
        animal1 = new Cat();
        animal2 = new Dog();
        process1 = new FeedProcess();
        ((FeedProcess)process1).setAnimal(animal1);
        process2 = new WalkProcess(animal2);
    }

    @Bean
    public Animal animal1() {
        return animal1;
    }

    @Bean
    public Animal animal2() {
        return animal2;
    }

    @Bean
    public Process process1() {
        return process1;
    }

    @Bean
    public Process process2() {
        return process2;
    }



}
