import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        String first = num.substring(0, num.length() - k);
        String last = num.substring(num.length() - k);
        String rev = "";
        for (int i = last.length() - 1; i >= 0; i--) {
            rev += last.charAt(i);
        }System.out.println(first + rev);
    }
}