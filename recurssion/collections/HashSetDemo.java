package collections;
import java.util.*;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("W");
    set.add("E");
    set.add("Q");
    set.add("D");
    set.add("B");
    set.add("P");
    System.out.println(set);
    System.out.println(set.size());
    
    System.out.println();

    List<String> list = (List<String>) set;
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
  }
}
