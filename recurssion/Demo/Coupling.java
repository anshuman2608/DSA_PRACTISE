package Demo;
interface A{
   void abc();
   void bcd();

}
interface Z{
    void xyz();
}


class B implements A , Z{

    @Override
    public void abc() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abc'");
    }

    @Override
    public void bcd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bcd'");
    }

    @Override
    public void xyz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'xyz'");
    }
    
}
class C implements A{

    @Override
    public void abc() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abc'");
    }

    @Override
    public void bcd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bcd'");
    }
    
}



public class Coupling {
    public static void main(String[] args) {
        
    }
}
