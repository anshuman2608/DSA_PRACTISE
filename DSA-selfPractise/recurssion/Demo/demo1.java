package Demo;
class A{
  int i = 10;
  int j = 20;
}
class B extends A{
  int i = 100;
  
  void showB() {
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("super.i = " + super.i);
  }
}
class C extends B {
  int i = 1000;
  int j = 2000;



  void showC() {
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("super.i = " + super.i);
    System.out.println("super.j = " + super.j);
    System.out.println();
    //System.out.println("super.super.i = " + super.super.i);
  }
}


class demo1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getClass());
        b.showB();
        System.out.println("-=-=-=-=-=-=-=-=-=");
        C c = new C();
        c.showC();
      }
}

