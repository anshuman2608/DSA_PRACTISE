public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,4,5,3};
        System.out.println(fun(arr1,0));
        System.out.println(fun(arr2,0));
        System.out.println(fun2(arr1,0));
        System.out.println(fun2(arr2,0));


    }
    public static boolean fun(int[] arr,int index){

         if(index==arr.length-1){
            return true;
         }else{
            if(arr[index] > arr[index+1]){
                return false;

            }else{
               return fun(arr,index+1);
            }
         }
    }public static boolean fun2(int[] arr,int index){

         if(index==arr.length-1){
            return true;
         }else{

            return arr[index] <= arr[index+1] && fun(arr,index+1);
            
         }
    }
    
}
