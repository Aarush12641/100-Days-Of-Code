
import java.util.Scanner;

public class Ntimes {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s1.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
