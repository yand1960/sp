package my.spring.di2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringAppConfiguration {

    Animal animal1, animal2;
    Process process;

    public MySpringAppConfiguration() {
        animal1 = new Cat();
        animal2 = new Dog();
        process = new Walking(animal2);
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
    public Process process() {
        return process;
    }
}
