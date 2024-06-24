public class palindrome {
    public static void main(String[] args) {
        int n=;
        System.out.println(fun(n));

    }
    public static boolean fun(int n){
        int last=n%10;
        int a=(int)Math.log10(n);
        int divider=(int)Math.pow(10,a);
        int first=n/divider;
        int newNum=(n- first*divider)/10;
        if(n<10){
            return true;
        }
        if(first!=last){
            return false;
        }else{
            return fun(newNum);
        }
        
    }
    
}
