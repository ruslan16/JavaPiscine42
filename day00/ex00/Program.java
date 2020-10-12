public class Program {

    public static void main(String[] args){
        int num = 479598;
        int ans = 0;

        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        ans += num % 10;
        num /= 10;
        ans += num;
        System.out.println(ans);
    }
}
