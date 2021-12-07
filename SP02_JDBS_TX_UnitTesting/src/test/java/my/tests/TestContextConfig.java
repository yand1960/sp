package my.tests;

import my.buslog.ProductFilter;
import my.dal.Repository;
import my.dal.RepositoryStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath:spring-config.xml") //так можно обеспечить комбинированную конфигурацию
public class TestContextConfig {

    Repository repository;
    ProductFilter filter;

    public TestContextConfig() {
        repository = new RepositoryStub();
        filter = new ProductFilter(repository);
    }

    @Bean
    public Repository repository() {
        return  repository;
    }

    @Bean
    public ProductFilter filter() {
        return  filter;
    }

}
