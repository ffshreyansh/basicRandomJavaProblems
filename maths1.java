public class maths1{
    
    public static boolean Number(int number){
        
        
        int reverse = 0;
        int stored = number;
        while(stored > 0){

            int digit = stored%10;
            stored /= 10;  
            reverse = reverse*10 + digit; 
                                
        }     

        if(number == reverse){

            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println(Number(1021));
    }
}
