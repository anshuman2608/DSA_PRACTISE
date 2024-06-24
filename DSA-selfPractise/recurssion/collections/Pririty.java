package collections;

import java.util.*;



public class Pririty {
    public static void main(String[] args) {
        //Queue<Integer> q1=new PriorityQueue<>();
        // TreeSet<Integer> q1=new TreeSet<>();
        // int k=5;
        // while(k>=0){
        //     q1.add(k);
        //     k--;
        // }
        // System.out.println(q1);
        // Iterator<Integer> itr=q1.descendingIterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        // while(!q1.isEmpty()){
        //     System.out.println(q1.poll());
        // }

        Map<Integer, String> map = new HashMap<>();
//add some elements in the map
System.out.println(map.put(1, "Ajay"));
System.out.println(map.put(1, "Aman"));
map.put(2, "Chaitnya");
map.put(3, "Bhawan");
map.put(5, "Dheeraj");
//System.out.println("Total elements in the map is " + map.size());
//System.out.println(map);
Set<Map.Entry<Integer , String> > set1=map.entrySet();

//Iterator<Map.Entry<Integer,String>> itr= set1.iterator();
//Iterator<Map.Entry<Integer,String>> itr= map.entrySet();
for(Map.Entry<Integer,String> a: set1){
    System.err.println(a);
}



// while(itr.hasNext()){
//     Map.Entry<Integer,String> m=itr.next();
//     System.out.println(m.getValue()+" "+m.getKey());
// }

Set<Integer> set=new HashSet<>();
set.add(1);
set.add(2);
Iterator<Integer> s1=set.iterator();




        
    }
}
