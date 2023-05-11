////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

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

        numDec(num);
        System.out.print("\n");
    }
	
	public static String convert(int number){
        // TODO
        return null;
    }

//!!!!!! REALIZZARE FUNZIONE DI CONTROLLO DI CORRETTEZZA DI INPUT

    public static void numDec(int num_dec){

         // num_dec == 50
         if(num_dec = 50) System.out.printf("L");

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

    public static void stampaInFile() {
        /*try {
            File file = new File("C:\\Users\\NADIYA\\Desktop\\all_num.txt");

            if(!file.exists()) file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
        */
            for (int i = 1; i < 1001; i++) {
                //pw.println(i);
                System.out.printf(i+" = ");
                numCent(i);
                System.out.printf(" \n");
            }
        /*
            pw.close();
        }

        catch (IOException e){
            System.out.printf("ERRORE CON FILE:" + e);
        }
        */
    }
}
