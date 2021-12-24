package my.spring.di.priority;

public class HelloJavaConfig implements Hello{

    public HelloJavaConfig() {
        System.out.println("Java config bean constructed");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Java configured bean");
    }
}
