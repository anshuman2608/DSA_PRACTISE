package Demo;

import java.util.Scanner;
public class TryCatchDemo {
  static void printElement(int arr[], int index) {
  try {
    System.out.println("The element at index " + index + " is " + arr[index]);
  }catch(ArrayIndexOutOfBoundsException ex) {
    System.out.println("Exception caught in printElement method");
    throw ex;//exception rethrown so caller can also do sth for this exception
  }
}

  static void checkAge(int age)  {
    try{if(age < 0 || age > 120) {
      //IllegalArgumentException ex = new IllegalArgumentException("The age must be between 0 and 120");
      ClassNotFoundException ex=new ClassNotFoundException("Class not found");
      throw ex;
    }
}catch(ClassNotFoundException ex){
    System.out.println("Class not found");
    throw ex;
}
  }

  public static void main(String[] args) {
    int arr[] = {10, 29, 340};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter index of array ");
    int index = sc.nextInt();
    try {
      printElement(arr, index);
      checkAge(155);
    }catch(ArrayIndexOutOfBoundsException ex) {
      System.out.println("Index must be from 0 to " + (arr.length - 1));\
    }catch(IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
}
