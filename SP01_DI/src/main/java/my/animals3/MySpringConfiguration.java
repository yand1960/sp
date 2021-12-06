package my.animals3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfiguration {

    @Bean
    public Animal animal1() {
        var cat = new Cat();
        return cat;
    }

    @Bean
    public Animal animal2() {
        var dog = new Dog();
        return dog;
    }

}
