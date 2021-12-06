package my.animals2;

import org.springframework.stereotype.Component;

@Component("animal2")
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("I eat bones");
    }

    @Override
    public String voice() {
        return "Hab";
    }
}
