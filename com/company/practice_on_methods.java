package com.company;

public class practice_on_methods {
    
    static void multiplication(int n){

        for(int i=1 ; i<=4 ; i++){

            System.out.println(n*i);
        }
    }

    static void pattern(int n){

        for(int i=0 ; i<n; i++){

            for(int j=0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // multiplication(7);
        pattern(5);
    }
}
