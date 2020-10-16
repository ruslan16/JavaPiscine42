package ex01;

public class Hen extends Thread{
    private Queue queue;
    private int count;

    public Hen(Queue queue, int count){
        this.queue = queue;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++){
            try {
                queue.printHen();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
