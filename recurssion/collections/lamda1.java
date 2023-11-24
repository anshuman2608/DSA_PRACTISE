package collections;

interface I1{
    void hello(String msg,int n);
}
class xyz implements I1{
    @Override
    public void hello(String msg,int n){
        System.out.println("welcome"+msg);
    }
}
public class lamda1 {
    public static void main(String[] args) {
        I1 a1=new xyz();
        a1.hello("Anshuman",1);
        
        I1 i1=new I1() {
            @Override
            public void hello(String msg,int n){
                System.out.println("welcome" +" "+msg);
            }
        };

        i1.hello("km",1);

        I1 i2 = (msg , n) -> System.out.println("welcome"+" "+msg);

        i2.hello("Singh",1);

        
    }
}
