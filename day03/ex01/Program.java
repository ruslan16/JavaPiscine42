package ex01;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        int index = 0;
        char[] str;

        str = args[0].toCharArray();
        index = args[0].indexOf('=') + 1;

        while (index < args[0].length()) {
            count = (count * 10) + (str[index] - '0');
            index++;
        }

        Queue queue = new Queue();
        Egg egg = new Egg(queue, count);
        Hen hen = new Hen(queue, count);

        egg.start();
        hen.start();
    }
}
