package subSecquence;

public class Permutations {
    public static void main(String[] args) {
        Permutation("", "abc");
        
    }
    static void Permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i, p.length());
            Permutation(f+c+s, up.substring(1));
        }
    }
}
