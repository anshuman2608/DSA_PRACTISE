package collections;
import java.util.*;


public class StackDemo {
  public static void main(String args[]) {
    Stack<String> stack = new Stack<String>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    stack.push("E");
    stack.add("ac");
    stack.add("ac");

    stack.peek();//return first object or throws exception if empty.
    stack.pop(); //remove the last element
    Iterator<String> itr=stack.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

  }
}
