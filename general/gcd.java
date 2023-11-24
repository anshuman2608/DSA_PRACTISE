package recurssion;

public class gcd {
    public static void main(String[] args) {
        int a=15;
        int b=25;
        System.out.println(lcm(b,a));

    }
    public static int gcd(int a,int b){
        if(b%a==0){
            return a;
        }else{
            return gcd(b%a,a);
        }
    }public static int lcm(int a,int b){

        return (a*b)/gcd(a, b);
    }
    
}
