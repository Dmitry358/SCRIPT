package it.unipd.mtss;

import java.io.IOException; //TEMPORANEO
import java.util.Scanner;
import java.io.File; //TEMPORANEO
import java.io.PrintWriter; //TEMPORANEO

public class IntegerToRoman{

    public static void main( String[] args ) {

        stampaInFile();
        Scanner in = new Scanner(System.in);
        System.out.print("\nINSERISCI NUMERO: ");
        int num = in.nextInt();
        in.close();

        numCent(num);
        System.out.print("\n");
    }
	
	public static String convert(int number){
        // TODO
        return null;
    }

//!!!!!! REALIZZARE FUNZIONE DI CONTROLLO DI CORRETTEZZA DI INPUT

    public static void numCent(int num) {

        int num_cent_rest = 0;
        int num_dec = 0;

        // num == 500
        if (num == 5000) System.out.printf("D");

        // 499 >= num >= 100
        else if(num/100>=1){
            // 499 >= num >= 400
            if (num / 400 >= 1) {
                System.out.printf("CD");
                numDec(num - 400);
            }

            // 399 >= num >= 100
            else {
                num_cent_rest = num / 100;
                for (int i = 1; i <= num_cent_rest; i++) System.out.printf("C");
                numDec(num % 100);
            }
        }

        // 99 >= num >= 1
        else numDec(num);
    }

    public static void numDec(int num_dec){
         //System.out.printf("  Dec:");
         int num_dec_rest = 0;
         int num_uni = 0;

        // 99 >= num_dec >= 90
         if (num_dec / 90 >= 1){
            System.out.printf("XC");
            numUni(num_dec - 90);
         }

         // 99 >= num_dec >= 50
         else if(num_dec/50>=1) {
             System.out.printf("L");

             num_dec_rest = num_dec - 50;

             for (int i = 1; i <= num_dec_rest / 10; i++) System.out.printf("X");

             numUni(num_dec % 10);
         }

         // 49 >= num_dec >= 10
         else if(num_dec/10>=1){
             
			 // 49 >= num >= 40
             if (num_dec / 40 >= 1) {
                 System.out.printf("XL");
                 numUni(num_dec - 40);
             }

             // 39 >= num >= 10
             else {
                 for (int i = 1; i <= num_dec / 10; i++) System.out.printf("X");
                 numUni(num_dec % 10);
             }
         }

         else numUni(num_dec);
    }

    public static void numUni(int num_uni){
        //System.out.printf("  Uni:");
        switch (num_uni){
            case (1): System.out.printf("I"); break;
            case (2): System.out.printf("II"); break;
            case (3): System.out.printf("III"); break;
            case (4): System.out.printf("IV"); break;
            case (5): System.out.printf("V"); break;
            case (6): System.out.printf("VI"); break;
            case (7): System.out.printf("VII"); break;
            case (8): System.out.printf("VIII"); break;
            case (9): System.out.printf("IX"); break;
        }
    }

}
