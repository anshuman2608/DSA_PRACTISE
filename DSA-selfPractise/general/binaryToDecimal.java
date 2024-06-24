package recurssion;

public class binaryToDecimal {
    public static void main(String[] args) {
        String str="1000";
        // System.out.println(str.charAt(0)-'0');
        // int a=str.charAt(0);
        // char c=str.charAt(0);
        // System.out.println(a+" "+c);
        System.out.println(fun(str));
        // System.out.println((int)Math.pow(2,3));
        // int a=Character.getNumericValue(str.charAt(1));
        // System.out.println(a);
        // int sum=a*(int)Math.pow(2,3);
        // System.out.println(sum);

    }
    public static int fun(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            int a=Character.getNumericValue(str.charAt(i));
            sum=sum+((a*(int)(Math.pow(2, str.length()-1-i))));
            System.out.println(sum +" "+str);
        }
        return sum;
        
    }
    public static int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
    
}
