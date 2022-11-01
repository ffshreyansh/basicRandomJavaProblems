// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//         Scanner sc = new Scanner(System.in);
//         int B = sc.nextInt();
//         int H = sc.nextInt();

//         int area = B*H;
//         if((B>0 && B<=100) && (H>0 && H<=100)){
//             System.out.println(area);
//         }else{
//         System.out.println("java.lang.Exception: Breadth and height must be positive");
//     }}
// }


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char a = (char) n;
        if(n>= -100 && n<=100){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        
    }
}