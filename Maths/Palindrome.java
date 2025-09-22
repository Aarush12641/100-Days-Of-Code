import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;
        }
        if(sum == num){
            System.out.print("the number is a Paindrome");
        }
        else{
            System.out.print("the number is not a Paindrome");
        }


    }
}
