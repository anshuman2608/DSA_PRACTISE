package recurssion;

public class decimalToBinary {
    public static void main(String[] args) {
        int a=8;
        fun(a);
        System.out.println();
        System.out.println(fun2(a));
    }
    public static void fun(int n){
        if(n==1){
            System.out.print(1);
            return;
        }else{
            fun(n/2);
            System.out.print(n%2);
        }
    }public static String fun2(int n){
        if(n==0){
            return "0";
        }else if(n==1){
            return "1";
        }else{
            return fun2(n/2)+(n%2);
        }
    }
    
}
