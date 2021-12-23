package my.spring.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultiAppender {

    @Autowired
    DataAppender appender;

    public void append3() {
        appender.append("YA1");
        appender.append("YA2");
        if ( 1 == 1)
            throw new RuntimeException("TEST EXCEPTION");
        appender.append("YA3");
    }
}
