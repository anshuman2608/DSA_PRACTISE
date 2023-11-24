package subSecquence;

import java.util.ArrayList;

public class AllSubSet {
    public static void main(String[] args) {
        System.out.println(fun("", "abc"));
        
    }
    static ArrayList<String> fun(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list =new ArrayList<>();
           list.add(p);

           return list;
        }
        char c=up.charAt(0);
        ArrayList<String> left=fun(p+c, up.substring(1));
        ArrayList<String> right=fun(p , up.substring(1));
        left.addAll(right);
        //System.out.println(left.size());
        return left;
    }
}
