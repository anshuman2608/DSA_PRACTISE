package DSA_Class_questions.Day1;

//Move all zeroes to the end
//    https://www.geeksforgeeks.org/move-zeroes-end-array/

public class p1 {
    public static void main(String[] args){
        int[] arr={0,1,0,2,0,3,0,4,0,0,0};
        int n=arr.length;
        pushZerosToEnd(arr,n);
       // pushZerosToLast(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        


    }
     //Simple way to do it by using two pointers
     // Here the order of the function is not maintained 
     // So if we want to maintain the order we have to optimize it

     public static void pushZerosToLast(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=0){
               i++;
            }else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
            }
        }
     }
     


    //In this function the order of the integers will be maintained 
    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
            
        }
        while(count<n){
            arr[count++]=0;
        }
        
    }
    
}
