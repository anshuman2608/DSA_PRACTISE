package collections;

interface x{
    default void mul(){
       System.out.println("i ama");
    }
    void add();

}
interface y{
    default void mul(){
       System.out.println("i amb");
    }
    void add();

}
interface z extends x{
    void sub();
}
interface m {
    default void mul(){
       System.out.println("i ama");
    }   
    void add();
}
class B implements z,m {

    @Override
    public void add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

}


public class A {
    public static void main(String[] args) {
        
    }
}
