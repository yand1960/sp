package my.spring.di2;

public class Feeding implements Process {

    private Animal animal;

    @Override
    public void run() {
        System.out.println(animal.getVoice());
        animal.eat();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
