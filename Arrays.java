import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
    // int[] marks = new int[3];

    // marks[0] = 97;
    // marks[1] = 95;
    // marks[2] = 90;

    // for(int i= 0; i<3; i++){
    //     System.out.println(marks[i]);
    // }
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int numbers[] = new int[size];
    // // System.out.println(size);

    // //input
    // for(int i=0; i<size; i++ ){
    //     numbers[i] = sc.nextInt();
    // }
    // //output
    // for(int i = 0; i<size ; i++){
    //     System.out.println(numbers[i]);
    // }

    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();\

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int numbers[] = new int[size];

    // //input

    // for(int i=0; i<size; i++){
    //     numbers[i] = sc.nextInt();
    // }

    // for(int i= 0; i<size; i++){
    //     System.out.println(numbers[i]);
    // // }
    

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int numbers[] = new int[size];

    // for(int i=0; i<size; i++){
    //     numbers[i] = sc.nextInt();

    // }

    // int x = sc.nextInt();
    
    // for(int i=0; i<numbers.length; i++){
    //     if(numbers[i] == x){
    //         System.out.println("x found at : " + i);
    //     }
    // }

    // Scanner sc =new Scanner(System.in);
    // int size = sc.nextInt();

    // String[] name = new String[size];

    // for(int i=0; i<size; i++){
    //     name[i] = sc.next();
    // }

    // for(int i = 0; i<name.length; i++){
    //     System.out.println("name " + (i+1) +" is : " + name[i]);
    // }

    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    
    // int numbers[] = new int[size];

    // //input
    // for(int i=0; i<size; i++ ){
    //     numbers[i] = sc.nextInt();

    // }

    // //output
    // int max = Integer.MAX_VALUE;
    // int min = Integer.MIN_VALUE;

    // for(int i=0; i<numbers.length; i++){
    //     if(numbers[i] < min){
    //         min = numbers[i];

    //     }
    //     if(numbers[i] > max){
    //         max = numbers[i];
    //     }
        
    // }
    // System.out.println("minimum number: " + min);  
    // System.out.println("maximum number: "+ max);

    // Scanner sc = new Scanner(System.in);
    //   int size = sc.nextInt();
    //   int numbers[] = new int[size];
 
    //   //input
    //   for(int i=0; i<size; i++) {
    //       numbers[i] = sc.nextInt();
    //   }
 
    //   int max = Integer.MIN_VALUE;
    //   int min = Integer.MAX_VALUE;
     
    //    for(int i=0; i<numbers.length; i++) {
    //        if(numbers[i] < min) {
    //            min = numbers[i];
    //        }
    //        if(numbers[i] > max) {
    //            max = numbers[i];
    //        }
    //    }
 
    //    System.out.println("Largest number is : " + max);
    //    System.out.println("Smallest number is : " + min);

    // Scanner sc = new Scanner(System.in);
    // double a = sc.nextDouble();
    // double b = sc.nextDouble();
        // double c = sc.nextDouble();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 0;
        for (int i=0; i<a; i++){
            fact = a*i;
            
        }
        System.out.println(fact);

    
      
   }
}
