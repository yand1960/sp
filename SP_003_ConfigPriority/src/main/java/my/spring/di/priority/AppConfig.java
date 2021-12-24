package my.spring.di.priority;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-config.xml")
@ComponentScan("my.spring.di.priority")
public class AppConfig {

    @Bean(name = "hello3")
    public Hello hello() {
        return new HelloJavaConfig();
    }

}


