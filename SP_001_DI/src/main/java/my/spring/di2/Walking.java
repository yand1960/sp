package my.spring.di2;

public class Walking implements Process {

    private Animal animal;

    public  Walking(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        System.out.println("Walking "
                + animal.getClass().toString()
                + " " + animal.getVoice());
    }
}
