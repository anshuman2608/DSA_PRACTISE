package recurssion;

public class steps2 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fun(n));

    }
    public static int fun(int n){

        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }
        
        else{

            return fun(n-1)+fun(n-2)+fun(n-3);
        }
    }
    
}
