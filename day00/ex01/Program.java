import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int countIf = 1;
        int div = 2;

        if (num <= 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        if (num % 2 == 0){
            System.out.println("false 1");
            System.exit(1);
        }

        while ((div * div <= num) && (num % div != 0)){
            div += 1;
            countIf++;
        }

        if (div * div > num){
            System.out.println("true " + countIf);
        }

        else{
            System.out.println("false " + countIf);
        }
    }
}
