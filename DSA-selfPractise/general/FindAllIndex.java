import java.util.*;
public class FindAllIndex {
     static ArrayList<Integer> sb=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3,4,5,3};
        ArrayList<Integer> ans=fun(arr,0,3,new ArrayList<>());
        //System.out.println(fun(arr,0,3,new ArrayList<>()));
        System.out.println(ans);
        
        
       

    }
   
    public static ArrayList<Integer> fun(int[] arr,int index,int target,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
            return fun(arr,index+1,target,list);
        }else{
            return fun(arr,index+1,target,list);
        }
    }
    
}
