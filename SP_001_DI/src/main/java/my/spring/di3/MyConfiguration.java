package my.spring.di3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConfiguration {
    Animal murka, bobik, barsik, sharik;
    Human vasya, masha;

    Process process;

    public MyConfiguration() {
        murka = new Cat();
        bobik = new Dog();
        barsik = new Cat();
        sharik = new Dog();
        vasya = new Vasya(Arrays.asList(murka, bobik));
        masha = new Masha(Arrays.asList(barsik, sharik));
        process = new PeopleFeedPets(Arrays.asList(vasya, masha));
    }

    @Bean
    public Animal murka() {return murka;}

    @Bean
    public Animal bobik() {return bobik;}

    @Bean
    public Animal barsik() {return barsik;}

    @Bean
    public Animal sharik() {return sharik;}

    @Bean
    public Human vasya() {return vasya;}

    @Bean
    public Human masha() {return masha;}

    @Bean
    public  Process process() {
        return process;
    }
}
