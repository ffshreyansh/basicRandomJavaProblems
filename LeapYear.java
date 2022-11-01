import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
    int fact=1;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.println("Factorial="+fact);
}
    

    //     if (year < 1 && year > 9999){
    //         return false;  
    // }else if (year%4 == 0 || year%100 != 0 || year%400 == 0){
    //     return true;
    // } else {
    //     return false;
    // }   


}
