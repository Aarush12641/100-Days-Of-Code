import java.util.Scanner;
public class swap2 {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter a number : "); 
        int b = s2.nextInt();


        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The number before after swapping "+a+" and " +b);
    }
}
