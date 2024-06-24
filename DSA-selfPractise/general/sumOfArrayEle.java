package recurssion;

public class sumOfArrayEle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(fun(arr,0));

    }
    public static int fun(int[] arr,int n){
        if(n==arr.length){
            
            return 0;
        }else{
            
            return arr[n] + fun(arr,n+1);
        }
    }
    
}
