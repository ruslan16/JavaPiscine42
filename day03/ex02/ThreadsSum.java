package ex02;

import java.util.ArrayList;
import java.util.List;

public class ThreadsSum extends Thread{
    private static List<Threads> mThreadList = new ArrayList<Threads>();

    private int last = 0;
    private int first = 0;
    private int[] arr;
    private int countTh;

    public ThreadsSum(int[] arr, int countTh){
        this.arr = arr;
        this.countTh = countTh;
    }

    public void launchThreads(){
        for (int i = 0; i < countTh; i++){

            if (i == 0){
                first = 0;
                last = arr.length/countTh - 1;
            }

            else if (i + 1 == countTh){
                first = last + 1;
                last = arr.length - 1;
            }

            else{
                first = last + 1;
                last = last + (arr.length/countTh);
            }

            mThreadList.add(new Threads(arr, first, last, i + 1));
        }
    }

    public void printSum() throws InterruptedException {
        int sum = 0;

        for (int i = 0; i < countTh; i++){
            mThreadList.get(i).start();
        }

        if (countTh < 15000) {
            Thread.sleep(200);
        }

        else if (countTh < 50000) {
            Thread.sleep(1000);
        }

        else if (countTh < 250000) {
            Thread.sleep(2000);
        }

        for (int i = 0; i < countTh; i++){
            sum += mThreadList.get(i).getSum();
        }

        System.out.printf("Sum by threads: %d\n", sum);
    }
}
