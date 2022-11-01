import java.util.Scanner;

public class PatternsPractice {
    public static void main(String[] args) {
        //     int num = 0;
        //     for(num=6; num>0; num--){
        //         for(int j=0; j<num; j++){
        //         System.out.print(num);
        //         }
                
        //     System.out.println("");
        //     }
        // }


    
//     for(int i=0; i<5; i++){
        
//         System.out.println("*****");
    
// }

    
    // for(int i=1; i<6    ;i++){
    //     for(int j=1;j<i;j++){
    //         System.out.print(j);
    //     }System.out.println(i);
    // }

    // for(int i=6; i>0; i--){
    //             for(int j=0; j<i; j++){
    //             System.out.print("*");
    //             }
                
    //         System.out.println("");
    //         }

    //     for(int i=0; i<9; i+=2){
    //         for(int j=0; j<i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }
    // int rows = 5, k = 0;

    // for (int i = 1; i <= rows; ++i, k = 0) {
    //   for (int space = 1; space <= rows - i; ++space) {
    //     System.out.print("  ");
    //   }

    //   while (k != 2 * i - 1) {
    //     System.out.print("* ");
    //     ++k;
    //   }

    //   System.out.println();
    // }
  
    // int num = 5, k = 0;
    
    // for(int i=1; i<num; ++i, k=0){
    //     for(int j=1; j<num-i ; ++j ){
    //         System.out.print("  ");

    //     }
    //     while(k != 2*i-1){
    //         System.out.print("* ");
    //         ++k;
    //     }
    //     System.out.println();
        
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    //input

    for(int i=0; i<size; i++){
        numbers[i] = sc.nextInt();
    }

    for(int i= 0; i<size; i++){
        System.out.println(numbers[i]);
    }

    }

    
}