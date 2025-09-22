
import java.util.Scanner;

public class Print_Name_N_Times {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times the name should be printed: ");
        sc.nextLine();
        int n = sc.nextInt();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.err.println((name));
        }

    }
}
