package my.animals3;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("I eat mice");
    }

    @Override
    public String voice() {
        return "Meow";
    }
}
