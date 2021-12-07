package my.tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("multiappender")
public class MultiAppender {

    @Autowired
    DataAppender appender;

    @Transactional
    public void append3() {
        appender.append("YA1");
        appender.append("YA2");
        if (1 == 1) {
            throw new RuntimeException("TEST EXception");
        }
        appender.append("YA3");
    }

}
