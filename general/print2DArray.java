package recurssion;

public class print2DArray {
       public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        fun(arr,0,0,0);

       }
       public static void fun(int[][] arr,int i,int j,int sum){
                if(i==arr.length){
                  return;
                }else{
                    if(j==arr[i].length){
                        System.out.println(sum);
                        fun(arr,i+1,0,0);
                    }else{
                        if(arr[i][j]%2==0){
                            fun(arr,i,j+1,sum+arr[i][j]);
                        }else{
                            fun(arr,i,j+1,sum);
                        }
                        
                        
                    }
                }
       }    
}
