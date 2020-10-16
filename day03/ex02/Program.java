package ex02;

import java.util.Random;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        final int MAX = 2000000;
        Random random = new Random();
        char[] arrOne;
        char[] arrTwo;
        int index = 0;
        int sizeArr = 0;
        int countTh = 0;
        int[] arr;

        arrOne = args[0].toCharArray();
        arrTwo = args[1].toCharArray();
        index = args[0].indexOf('=') + 1;

        while (index < arrOne.length){
            sizeArr = (sizeArr * 10) + (arrOne[index] - '0');
            index++;
        }

        index = args[1].indexOf('=') + 1;

        while (index < arrTwo.length) {
            countTh = (countTh * 10) + (arrTwo[index] - '0');
            index++;
        }

        if (sizeArr > MAX || countTh > MAX){
            System.err.println("Error");
            System.exit(-1);
        }

        arr = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++){
            arr[i] = random.nextInt(2000);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
        ThreadsSum ts = new ThreadsSum(arr, countTh);
        ts.launchThreads();
        ts.printSum();
    }
}
