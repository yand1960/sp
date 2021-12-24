package my.spring.di.priority;

public class HelloXML implements Hello{

    public HelloXML() {
        System.out.println("XML bean constructed");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from XML bean");
    }
}
