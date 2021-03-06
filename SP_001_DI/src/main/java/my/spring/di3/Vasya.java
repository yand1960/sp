package my.spring.di3;

import java.util.List;

public class Vasya implements Human{

    private String name;
    private List<Animal> pets;

    public Vasya(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Animal> getPets() {
        return pets;
    }

    @Override
    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public void feedAllPets() {
        for (var p: pets) {
            System.out.println(name + " feeds his " + p.getClass());
            p.eat();
        }
    }
}
