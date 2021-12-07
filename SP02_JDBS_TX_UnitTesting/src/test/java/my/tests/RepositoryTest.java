package my.tests;

import my.dal.Repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-config.xml")
public class RepositoryTest {

    @Autowired
    Repository repository;

    @Test
    public void getProductsTest() {
        var products = repository.getProducts();
        //System.out.println(products.size());
        Assertions.assertEquals(504, products.size());
        Assertions.assertEquals("Headset Ball Bearings", products.get(3).getName());
    }

}
