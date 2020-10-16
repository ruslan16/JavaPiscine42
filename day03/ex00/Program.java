package ex00;


public class Program {
    public static void main(String[] args) throws InterruptedException {
        Threads egg;
        Threads hen;
        int count = 0;
        int index;
        char[] str;

        str = args[0].toCharArray();
        index = args[0].indexOf('=') + 1;

        while (index < args[0].length()) {
            count = (count * 10) + (str[index] - '0');
            index++;
        }

        egg = new Threads(count, "Egg");
        hen = new Threads(count, "Hen");

        egg.start();
        hen.start();

        egg.join();
        hen.join();

        for (int i = 0; i < count; i++){
            System.out.println("Human");
        }
    }
}
