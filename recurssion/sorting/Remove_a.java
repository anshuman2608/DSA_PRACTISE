package sorting;

public class Remove_a {
    public static void main(String[] args) {
        // String str="I am a good boy,and also smart. ";
        // String cleanedString = str.replaceAll("[^a-zA-Z0-9]", " ");
        // String[] arr=cleanedString.split(" ");
        // for(String a:arr){
        //     //System.out.println(a.contains(","));
        //     System.out.println(a);
        // }
        //skip("", "abcdabd");
        //System.out.println(skip2("aaabbc"));
        String str="appleabcd";
        System.out.println(skipApple(str));
    }static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           skip(p, up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }else{
            return ch+ skip2(up.substring(1));
        }
    }static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        char c=str.charAt(0);
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else{
            return c+skipApple(str.substring(1));
        }
    }
    
}



