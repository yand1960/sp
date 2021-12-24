package my.spring.di.priority;

import org.springframework.stereotype.Component;

@Component("hello2")
public class HelloAnnotation implements Hello{

    public HelloAnnotation() {
        System.out.println("Anootation bean constructed");
    }
    
    @Override
    public void sayHello() {
        System.out.println("Hello from Annotation bean");
    }
}
