package ex01;

public class Queue {
    private int i = 1;

    public synchronized void printEgg() throws InterruptedException {
        while (i % 2 == 0){
            wait();
        }
        i++;
        System.out.println("Egg");
        notify();
    }

    public synchronized void printHen() throws InterruptedException {
        while (i % 2 == 1){
            wait();
        }
        i++;
        System.out.println("Hen");
        notify();
    }
}
