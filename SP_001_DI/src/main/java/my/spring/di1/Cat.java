package my.spring.di1;

import org.springframework.stereotype.Component;

@Component("murka")
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("I eat mice");
    }

    @Override
    public String getVoice() {
        return "Myaou";
    }
}
