package my.animals3;

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
