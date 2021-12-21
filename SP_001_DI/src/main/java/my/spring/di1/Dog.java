package my.spring.di1;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("I eat bones");
    }

    @Override
    public String getVoice() {
        return "Hab";
    }
}
