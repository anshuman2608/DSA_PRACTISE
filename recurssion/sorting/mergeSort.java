package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        int[] finalans=sort(arr);
        for(int a:finalans){
            System.out.print(a+"    ");
        }

    }
    
    public static int[] sort(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=sort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] ans=merge(left,right);
        
        return ans;
        
    }
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
    
}
