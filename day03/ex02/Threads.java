package ex02;

public class Threads extends Thread {
    int[] arr;
    int first;
    int last;
    int name;
    int sum;

    public Threads(int[] arr, int first, int last, int name){
        this.arr = arr;
        this.first = first;
        this.last = last;
        this.name = name;
    }

    public void run(){
        for(int i = first; i <= last; i++){
            sum += arr[i];
        }

        System.out.printf("Thread %d: from %d to %d sum is %d\n", name, first, last, sum);
    }

    public int getSum(){
        return (sum);
    }

}
