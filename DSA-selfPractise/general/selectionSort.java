import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int index){
        if(index==arr.length-1){
            return;
        }
        int minIndex=index;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i] < arr[minIndex]){
                minIndex=i;
            }
        }
          int temp=arr[index];
          arr[index]=arr[minIndex];
          arr[minIndex]=temp;

          sort(arr, index+1);

    }
    
}
