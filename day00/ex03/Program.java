import java.util.Scanner;

public class Program {

    public static int searchL(int num, int num2, int num3, int num4, int num5){
        int min = num;

        if (min > num2){
            min = num2;
        }

        if (min > num3){
            min = num3;
        }

        if (min > num4){
            min = num4;
        }

        if (min > num5){
            min = num5;
        }

        return (min);
    }

    public static int readMark(Scanner scan) {
        int min;
        int one, two, three, four, five;

        one = scan.nextInt();
        two = scan.nextInt();
        three = scan.nextInt();
        four = scan.nextInt();
        five = scan.nextInt();

        if ((one > 9) || (two > 9) || (three > 9)
                || (four > 9) || five > 9){
            System.err.println("IllegalArguments");
            System.exit(-1);
        }

        min = searchL(one, two, three, four, five);
        return (min);
    }

    public static long reverseNum(long num){
        long newNum = 0;

        while (num > 0){
            newNum = (newNum * 10) + num % 10;
            num /= 10;
        }
        return (newNum);
    }

    public static void printWeek(long info) {
        long mark;
        int i = 1;

        while (info > 0){
            mark = info % 10;
            System.out.print("Week " + i + " ");
            while (mark > 0){
                System.out.print("=");
                mark--;
            }
            System.out.println(">");
            i++;
            info /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int LIMIT = 18;
        String week;
        int nameW, tmp, nameTmp, countW = 1;
        long info = 0;

        week = scan.next();

        if (week.equals("42")){
            System.exit(1);
        }

        nameW = scan.nextInt();

        while (countW <= LIMIT){
            tmp = readMark(scan);
            info = info * 10 + tmp;
            week = scan.next();
            if (week.equals("42")){
                break;
            }
            nameTmp = nameW;
            nameW = scan.nextInt();
            if (nameTmp > nameW){
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            countW++;
        }

        info = reverseNum(info);
        printWeek(info);
    }
}
