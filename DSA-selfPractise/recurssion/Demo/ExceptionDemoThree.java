import java.util.Scanner;
public class ExceptionDemoThree{
  public static void main(String args[]){
    //Create an array of five elements
    int arr[] = {10, 20, 54, 86, 9};
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Entered in try block...");
      System.out.print("Enter the index of element to access ");
      int index = sc.nextInt();
      System.out.println("arr[" + index + "] / " + (index - 1) + " = " + (arr[index]/(index - 1)));
      System.out.println("Leaving the try block...");
    }
    catch(ArithmeticException ex){
      System.out.println("Inside catch block");
      System.out.println("The divisor must not be zero");
    }
    catch(Exception ex){
      System.out.println("Inside catch block");
      System.out.println("Index must be from 0 to " + (arr.length - 1));
    }
    System.out.println("Bye Bye");
    //close the object of Scanner class
    sc.close();
  }
}