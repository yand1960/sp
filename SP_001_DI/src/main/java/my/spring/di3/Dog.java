package my.spring.di3;

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
