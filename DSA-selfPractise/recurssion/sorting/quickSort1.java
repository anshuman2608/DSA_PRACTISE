package sorting;

public class quickSort1 {
    public static void main(String[] args) {
        int[] arr={2,5,3,4,7,2};
        sort(arr, 0, arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
        
    }
    public static void sort(int[] arr, int low,int high){

        while(low<high){
            int a=partition(arr,low,high);

            sort(arr,low,a-1);
            sort(arr,a+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    } 
}
