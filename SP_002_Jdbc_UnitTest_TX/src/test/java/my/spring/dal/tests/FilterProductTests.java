package my.spring.dal.tests;

import my.spring.buslog.FilterProducts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppTestConfig.class)
public class FilterProductTests {

    @Autowired
    FilterProducts filter;

    @Test
    public void getProductsByFirstLettersTest() {
        var result = filter.getProductsByFirstLetters("la");
        Assertions.assertEquals(4, result.size());
    }
}
