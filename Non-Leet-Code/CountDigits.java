import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int temp = n;
            int count = 0;
            while(temp>0){
                temp = temp/10;
                count++;
            }
            System.out.println("The number of digits in "+n+ " is: "+count);
    }
}
