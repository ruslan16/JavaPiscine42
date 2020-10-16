package ex01;

public class Egg extends Thread{

    private Queue queue;
    private int count;

    public Egg(Queue queue, int count){
        this.queue = queue;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++){
            try {
                queue.printEgg();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
