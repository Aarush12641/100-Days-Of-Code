import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s1.nextInt();

        if(n%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("the number is odd");

        }

        

    }    
}
