public class pattern1 {
    public static void main(String[] args) {
        int r=4;
        int c=0;
        fun(r,c);

    }
    public static void fun(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*"+" ");
            fun(r,c+1);
        }else{
            System.out.println();
            fun(r-1,0);
        }
    }
    
    
}
