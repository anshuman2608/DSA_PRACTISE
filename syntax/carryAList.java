package syntax;

public class carryAList {
    static int[] arr=new int[5];
    public static void main(String[] args) {
        int[] a=fun(5);
        for(int i:a){
            System.out.println(i);
        }
        
    }
    public static int[] fun(int n){
        int a=1;
        if(a>n){
            return arr;
        }
        arr[a-1]=a;
        a++;
        return fun(n);

    }
}
