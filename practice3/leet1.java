public class leet1 {
    static int subtractProductAndSum(int n){

        int sum = 0;
        int mult = 1;
        
        while(n != 0){

            sum += n%10;
            
            mult *= n % 10;
            
            n = n/10;
        }
    
        
        return  mult-sum;


    }
   
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(324));
    }
}
