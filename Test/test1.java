package Test;

public class test1 {
    public static void main(String[] args) {
        String str="racercar";
        String str1="abcd";
        //String s="racercar";
        System.out.println(isPalindrome(str1));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        StringBuilder sb=new StringBuilder();
        int n=str.length()-1;
        String s=fun( str, sb,n);
        System.out.println(s+" "+str);
        return s.equals(str);
    }
    public static String fun(String s,StringBuilder sb,int n){
         if(n<0){
             return sb.toString();
         }
         sb.append(s.charAt(n));
         return fun(s, sb, n-1);

    }
}
