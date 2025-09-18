public class LCM {
    public static int gcD(int a, int b){
        if(b==0) return a;
        return gcD(a,a%b);   
    }

    public static int lcm(int a,int b){
        return (a*b)/gcD(a,b);
    }

    public static void main(String[] args){
        int a = 25;
        int b = 50;
        System.out.print("The LCM of "+a+" and "+b+" is : "+lcm(a, b) );

    }}