package Demo;
import java.util.*;


public class demo2 {
    static String s="Anshuman";
    String s1="Sakshi";
    demo2(){
        this.s="Sakshi";
        this.s1="Anshuman";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(demo2.s);
        System.out.println(this.s);
        demo2 d1=new demo2();

        System.out.println(d1.s1);
        System.out.println(demo2.s);
    }
    void fun(){
        System.out.println(this.s);
    }

}
