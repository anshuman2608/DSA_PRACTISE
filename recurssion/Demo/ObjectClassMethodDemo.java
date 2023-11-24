package Demo;
class ABC {
  int i;
  int j;

  ABC(){
    i = 10;
    j = 20;
  }

  void show() {
    System.out.println(i + " " + j);
  }
}


public class ObjectClassMethodDemo {
  public static void main(String[] args) {
    ABC a1 = new ABC();
    ABC a2 = new ABC();
    ABC a3 = a2;

    System.out.println(a1.equals(a2));
    System.out.println(a2.equals(a3));
    System.out.println(a1.equals(a3));

    System.out.println();

    System.out.println(a1.hashCode() + " " + Integer.toHexString(a1.hashCode()));
    System.out.println(a2.hashCode() + " " + Integer.toHexString(a2.hashCode()));
    System.out.println(a3.hashCode() + " " + Integer.toHexString(a3.hashCode()));

    System.out.println();

    System.out.println(a1.getClass());

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3.toString());
  }
}