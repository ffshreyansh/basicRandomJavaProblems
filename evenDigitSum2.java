public class evenDigitSum2 {
    public static int getEvenDigit( int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        int digit;
        int stored = number;
        while(stored>0){

            // digit = stored%10;
            stored /= 10;

            if(stored % 2 == 0){
                sum++;
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {
        getEvenDigit(1243);
    }
}
