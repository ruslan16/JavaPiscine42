package ex00;

public class Threads extends Thread{
    private int count = 0;
    private String name = null;

    public Threads(int count, String name){
        this.count = count;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.name);
        }
    }
}
