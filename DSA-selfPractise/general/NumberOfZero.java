public class NumberOfZero {
    public static void main(String[] args) {
        String str="011001";
        System.out.println(fun(str,0,0));

    }
    public static int fun(String str,int c,int index){
        if(index==str.length()){
            return c;
        }

        if(str.charAt(index)=='0'){
            return fun(str,c+1,index+1);
        }else{
            return fun(str,c,index+1);
        }
    }
    
}
