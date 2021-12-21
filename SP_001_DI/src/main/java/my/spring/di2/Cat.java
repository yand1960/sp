package my.spring.di2;

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
