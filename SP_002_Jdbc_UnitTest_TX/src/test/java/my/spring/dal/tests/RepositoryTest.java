package my.spring.dal.tests;

import my.spring.dal.Repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//Эти аннотации обеспечивают работу теста в контексте спринга
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-config-jdbc.xml")
//@ContextConfiguration("classpath:spring-config-rest.xml")
//@ContextConfiguration("classpath:spring-config-stub.xml")
public class RepositoryTest {

    @Autowired
    Repository repository;

    @Test
    public void getProductsText() {
        var products = repository.getProducts();
        //Assertions.assertEquals(504, products.size());
        var p = products.get(4);
        Assertions.assertEquals("Blade",p.getName());
        Assertions.assertEquals("BL-2036",p.getProductNumber());
        Assertions.assertEquals(0.0,p.getListPrice());
    }

}
