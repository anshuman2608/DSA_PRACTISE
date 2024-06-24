package Exception;
import java.time.*;
import java.time.format.*;

import java.io.FileNotFoundException;

class P{
    public static void main(String[] args) {
        //DateTimeFormatter d=new DateTimeFormatter();
        String s="abc";
        System.out.println(s.indexOf('c'));
        
        
    }
  public void show() throws FileNotFoundException{

  }
}

class Q extends P{
  public void show() throws ClassCastException {//okay

  }
}
