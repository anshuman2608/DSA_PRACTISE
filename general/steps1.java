package recurssion;

public class steps1 {
  public static void main(String[] args) {
    int n=10;
    int step=3;
    System.out.println(fun(n,step));
    


  }  
  public static int fun(int n,int step){
    if(n<=0){
        return 0;
    }else if(n<=step){
        return 1;
    }else{
       
        return fun(n-step,step) +1;
    }
  }
}
