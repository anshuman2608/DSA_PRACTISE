package DSA_Class_questions.Day1;

//Move all zeroes to the end
//    https://www.geeksforgeeks.org/move-zeroes-end-array/

public class p1 {
    public static void main(String[] args){
        int[] arr={1,0,2,0,3,0,4,0};
        int n=arr.length;
        pushZerosToEnd(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        


    }
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
