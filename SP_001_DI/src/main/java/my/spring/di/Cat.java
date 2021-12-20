package my.spring.di;

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
