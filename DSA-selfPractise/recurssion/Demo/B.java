package Demo;

class P{}

class Q extends P{}

class A{
  Q show(){
    System.out.println("A");
    return new Q();
  }
}

class B extends A{
  P show(){
    System.out.println("B");
    return new P();
  }

  public static void main(String args[]){
    A a = new B();
    a.show();
  }
}


