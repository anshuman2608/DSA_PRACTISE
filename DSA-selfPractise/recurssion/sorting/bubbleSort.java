package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,3,6,4};
        bubble(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    public static void bubble(int[] arr){
        boolean swap=true;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=false;
                }
            }
            if(swap){
                return;
            }
        }
    }
}
