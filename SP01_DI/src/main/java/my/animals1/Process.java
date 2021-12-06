package my.animals1;

public class Process {

    public static void main(String[] args) {
        //При POJO тесная зависимость неизбежна
        Animal a = new Cat();
        a.eat();
    }

}
