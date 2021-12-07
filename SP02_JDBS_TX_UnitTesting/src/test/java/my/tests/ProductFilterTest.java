package my.tests;

import my.buslog.ProductFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:spring-config.xml")
@ContextConfiguration(classes = TestContextConfig.class)
public class ProductFilterTest {

    @Autowired
    ProductFilter filter;

    @Test
    public void filterByFirstLettersTest() {
        var products = filter.getProductsByFirstLetters("a");
        Assertions.assertEquals(3,products.size());
    }

}
