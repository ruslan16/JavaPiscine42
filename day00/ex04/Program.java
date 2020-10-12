import java.util.Scanner;

public class Program {

    public static boolean isThisSym(char sym, char str) {
        boolean flag = false;

        if (sym == str){
            flag = true;
        }
        return (flag);
    }

    public static boolean isInStr(char sym, char[] str) {
        boolean flag = false;
        int size;

        size = str.length;
        for (int i = 0; i < size; i++){
            if (sym == str[i]){
                flag = true;
                break;
            }
        }
        return (flag);
    }

    public static int getIndex(char sym, char[] str) {
        int index = 0, size;

        size = str.length;

        for (int i = 0; i < size; i++){
            if (sym == str[i]){
                index = i;
                break;
            }
        }
        return (index);
    }

    public static void parsingStr(char[] result) {
        int size;
        int j = 0, k = 0;
        char[] newStr;
        int [] countSym;

        size = result.length;
        newStr = new char[size];
        countSym = new int[size];
        newStr[0] = result[0];
        countSym[0] = 1;

        for (int i = 1; i < size; i++){
            if (isThisSym(result[i], newStr[j])){
                countSym[k]++;
            }
            else if (isInStr(result[i], newStr)){
                j = getIndex(result[i], newStr);
                k = j;
                countSym[k]++;
            }
            else {
                j++;
                k++;
                newStr[j] = result[i];
                countSym[k] = 1;
            }
        }
        //sortingArray(newStr, countSym);
    }

    public static void main(String[] args) {
        final int PERIOD = 999;
        final int HEIGHT = 10;
        final int COUNTSYM = 10;
        String buf;
        char[] result;

        Scanner scan = new Scanner(System.in);
        buf = scan.nextLine();
        result = buf.toCharArray();
        parsingStr(result);
    }
}
