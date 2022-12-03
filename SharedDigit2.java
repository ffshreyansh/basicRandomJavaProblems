public class SharedDigit2 {
    public static boolean hasSharedDigit(int a, int b){

        if(a<10 || b<10 || a>90 || b>90){
            return false;
        }else{return (a%10 == b%10) || (a/10 == b/10) || (a%10 == b/10) || (a/10 == b%10);}
    }
}
