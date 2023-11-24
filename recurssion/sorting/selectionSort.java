package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={2,5,3,6,4};
        selection(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void selection(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    
}
