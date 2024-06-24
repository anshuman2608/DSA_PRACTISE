package Test;

public class memoryOverflow {
    public static void main(String[] args) {
        byte b=127;
        byte c= (byte) (b + 1);
        int d=Integer.MAX_VALUE;
        int e=d+1;
        System.out.println(d);
        System.out.println(e);
    }
}
