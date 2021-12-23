package my.spring.dal.tests;

import my.spring.buslog.FilterProducts;
import my.spring.buslog.FilterProductsImpl;
import my.spring.dal.Product;
import my.spring.dal.Repository;
import my.spring.dal.RepositoryStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath: spring-config-jdbc.xml")
public class AppTestConfig {

    @Bean
    Repository repository() {
        return new RepositoryStub();
    }

    @Bean
    FilterProducts filter() {
        return new FilterProductsImpl(repository());
    }
}
