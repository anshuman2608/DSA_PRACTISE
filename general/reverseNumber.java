package recurssion;

public class reverseNumber {
    public static void main(String[] args) {
        int n=123;
        System.out.println(fun(n));
        //System.out.println((int)Math.log10(100));

    }
    public static int fun(int n){
        if(n<10){
            return n;
        }else {
            int a=(int)Math.log10(n);
            int num=(n%10)*(int)Math.pow(10, a);
            return num+fun(n/10);
        }
    }
    
}
