import java.util.Scanner;

public class Program {

    public static boolean isPrimary(int num, int div) {
        boolean flag = true;

        while ((div * div <= num) && (num % div != 0)){
            div += 1;
        }

        if (div * div <= num){
            flag = false;
        }

        return (flag);

    }

    public static int sumNum(int num) {
        int ans = 0;

        while (num > 0){
            ans += num % 10;
            num /= 10;
        }

        return (ans);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sum_num = 0;
        int count = 0;

        if (num <= 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        while (num != 42){
            sum_num = sumNum(num);
            if (isPrimary(sum_num, 2) == true){
                count++;
            }
            num = scan.nextInt();
        }

        System.out.println("Count of coffee-request - " + count);
    }
}
