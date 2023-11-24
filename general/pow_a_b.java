package recurssion;

public class pow_a_b {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(fun1(a,b));
    }
    public static int fun1(int a,int b){
        if(b==0){
            return 1;
        }else{
            return a*fun1(a,b-1);
        }
    }
    
}
