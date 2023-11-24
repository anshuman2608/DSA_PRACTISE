package syntax;

public class initialValueOfArray {
    public static void main(String[] args) {
        int[] arr=new int[26];
        String s="abce";
        String t="cba";
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            //System.out.println(arr[0]);
        }
        for(int i=0;i<arr.length;i++){
            //arr[s.charAt(i)-'a']++;
            System.out.println(arr[i]);
        }
    }
}
