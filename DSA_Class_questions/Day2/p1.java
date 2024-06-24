package DSA_Class_questions.Day2;

import java.util.HashSet;
import java.util.Set;

//Given an array [1,2,3,4,1,5] create 2 boolean string represent whether the element 
//present in right or left side for this given input output will be [000010,100000]


public class p1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,5};
        String[] strArr=function(arr);
        System.out.println(strArr[0]+" "+strArr[1]);


    }
    public static String[] function(int[] arr){
       
        Set<Integer> left = new HashSet<>();
        Set<Integer> right= new HashSet<>();
        StringBuilder leftStr= new StringBuilder();
        StringBuilder  rightStr=new StringBuilder();

        for(int i=0;i<arr.length;i++){
            int n=arr.length-1;
           if(left.contains(arr[i])){
              leftStr.append('1');
           }else{
               leftStr.append('0');
           }
           left.add(arr[i]);

           if(right.contains(arr[n-i])){
            rightStr.append('1');
           }else{
            rightStr.append('0');
           }
           right.add(arr[n-i]);
        }
        //System.out.println(leftStr.toString()+" "+rightStr.reverse().toString());
        return new String[] {leftStr.toString(),rightStr.toString()};




    }
}
