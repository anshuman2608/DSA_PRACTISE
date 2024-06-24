package Demo;

import java.util.Collections;

public class twoSum {
    public static void main(String[] args) {
        int[]  arr={0,1,2,3,4,5};
        int k=5;
        sum(arr, k);
        
    }
    public static void sum(int[] arr,int k){

        
        
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            if(arr[i]+arr[j]<k){
                i++;
            }
            if(arr[i]+arr[j]>k){
                j--;
            }

        }
    }
}
