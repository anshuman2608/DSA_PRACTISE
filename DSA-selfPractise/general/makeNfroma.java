package recurssion;

public class makeNfroma {
    public static void main(String[] args) {
        int n=1000;
        int x=4;
        if(fun(n,1)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
         if(fun(x,1)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    public static boolean fun(int n,int a){
        if(a>n){
            return false;
        }else if(a==n){
            return true;
        }else{
            return fun(n,10*a) || fun(n,20*a);
        }
    }
    
}
