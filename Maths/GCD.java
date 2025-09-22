public class GCD {
    public static int gcD(int a, int b){
        if(b==0) return a;
        return gcD(a,a%b);   
    }
    public static void main(String[] args) {
        int a  = 50;
        int b = 25;

        System.out.println("GCD of "+a+" and "+b+" is: "+gcD(a,b));
    }
    
}
