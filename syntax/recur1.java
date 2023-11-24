package syntax;


//write a recurssive function which take input int n and returns an array of int[] arr as output
// solve by three methods
// Method 1 . by taking the static variable in the class.
public class recur1 {
    static int[] ans;
    public static void main(String[] args) {
        int n=5;
        int[] result=fun(5);
        for(int a:result){
            System.out.println(a);
        }
    }
    public static int[] fun(int n){
        ans= new int[n];
        
        helper1(ans, n,0);
        return ans;
    }
    public static void  helper1(int[] ans,int n,int index){
         if(n<1){
            return ;
         }
         ans[index]=index+1;
         helper1(ans, n-1, index+1);
    }
}
