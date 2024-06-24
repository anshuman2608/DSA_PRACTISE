package recurssion;

public class evenSumOfEle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(fun(arr,0,0));

    }
    public static int fun(int[] arr,int index,int sum){
        if(index==arr.length){
            return sum;
        }else{
            if(arr[index]%2==0){
                int a=arr[index];
                return fun(arr,index+1,sum+a);
            }else{
                return fun(arr,index+1,sum);
            }
        }
    }
    
}
