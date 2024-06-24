package Demo;

public class KmSakhai {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int ans=add(arr);
        System.out.println(ans);
        
    }
    static int add(int[] val){
        int sum=0;
        for(int a:val){
            sum+=a;
        }
        return sum;
    }
}
