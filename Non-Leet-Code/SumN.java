
import java.util.Scanner;

public class SumN {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ")
        int n = s1.nextInt();

        int sum = 0;
        for (i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of first" + n + "number is :" + sum);
    }
}
