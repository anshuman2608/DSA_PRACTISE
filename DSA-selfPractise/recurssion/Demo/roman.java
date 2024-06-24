package Demo;
import java.util.*;

public class roman {
    public static void main(String[] args) {
        int n=112;
    }
    public static void fun(int n,StringBuilder sb){

        //StringBuilder sb=new StringBuilder();
        if(n==0){
            return;
        }

        if(n>100 && n<500){
            n=n%100;
            sb.append("C");
            fun(n,sb);
        }
        if(n>50 && n<100){
            n=n%50;
            sb.append("L");
            fun(n,sb);
        }
        if(n>10 && n<50 ){
            n=n%10;
            sb.append("X");
            fun(n, sb);
        }
        if(n>5 && n<10){
            n=n%5;
            sb.append("V");
        }
        

    }
}
