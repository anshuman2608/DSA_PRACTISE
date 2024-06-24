package collections;
import java.util.*;
public class list1 {
    public static void main(String[] args) {
       
        // ArrayList<Integer> list=new ArrayList<>();
        // int k=1;
        // for(int i=0;i<10;i++){
        //     list.add(k);
        //     k++;
        // }
        
        // ListIterator<Integer> itr=list.listIterator();
        // while(itr.hasPrevious()){
        //     int a=itr.previous();
        //     System.out.println(a);
        // }
        // System.out.println(list);
        List<String> ls = new LinkedList<>();
ls.add("A");
ls.add("B");
//ls.add(1,"W"); //now elements of the list are W A B
ls.add("D");
ls.add("D"); //duplicate element is allowed
ls.add("T");

//ls.add(null); //even for multiple times.
System.out.println(ls.get(1)); //[A, W, B, D, D, T, null, null]


// ListIterator<String> listItr = ls.listIterator();
// while(listItr.hasPrevious()) {
//     String element = listItr.previous(); //D B W Z A
//     System.out.print(element + " ");
//     if(element.equals("Z"))
//       listItr.remove();
//   }
//   System.out.println("\n" + ls); //[A, W, B, D]

        
}




        
    
}
