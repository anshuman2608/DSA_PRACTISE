package recurssion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(sum1(n));
        System.out.println(sum2(n));

    }
    //but here it is a iterative method fun is not calling itself again and again
    //instead it is iterating over the give range with base condition
    public static int sum1(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static int sum2(int n){
        
        if(n==0){
            return 0;
        }else{
             return (n%10)+sum2(n/10);
        }
            
        
    } 
    
}
