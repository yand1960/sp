package my.spring.boot;

public class Counter {

    private int counter = 0;

    public int incAndGet() {
        counter += 1;
        return counter;
    }

}
