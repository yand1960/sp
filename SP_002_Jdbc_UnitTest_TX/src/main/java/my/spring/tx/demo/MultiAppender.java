package my.spring.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MultiAppender {

    @Autowired
    DataAppender appender;

    // Аннотация @Transactional управляет границами (потоком)
    // трансакции в стеке вызовов
    // см. также spring-config-tx-demo.xml
    @Transactional
    public void append3() {
        appender.append("YA1");
        appender.append("YA2");
        if (1 == 0)
            throw new RuntimeException("TEST EXCEPTION");
        appender.append("YA3");
    }
}
