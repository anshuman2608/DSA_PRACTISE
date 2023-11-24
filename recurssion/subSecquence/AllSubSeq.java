package subSecquence;
import java.util.*;


public class AllSubSeq {
    public static void main(String[] args) {
        String str="sbs";
        //subseq("", str);
        //isPalindrome(str);
        ArrayList<String> a=new ArrayList<>();
        subseq2("", str,a);
        //System.out.println(a);
        ArrayList<String> ans=new ArrayList<>();
        
        for(String s:a){
            boolean b=isPalindrome(s);
            if(b){
                ans.add(s);
            }
        }


        Collections.sort(ans);

        System.out.println(ans.get(1));


    }
    // static void subseq(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char c=up.charAt(0);
    //     subseq(p+c, up.substring(1));
    //     subseq(p, up.substring(1));
        

    // }
    static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        //boolean ans=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                //ans=false;
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
    static void subseq2(String p,String up, List<String> str){
        //ArrayList<String> str=new ArrayList<>();
        if(up.isEmpty()){
            
            str.add(p);
            return ;
            
        }
        char c=up.charAt(0);
        subseq2(p+c, up.substring(1),str);
        subseq2(p, up.substring(1),str);
        //return str;
    }
}
