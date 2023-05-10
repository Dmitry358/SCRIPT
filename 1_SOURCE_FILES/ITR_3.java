package it.unipd.mtss;

import java.lang.String;

import java.io.IOException; //TEMPORANEO
import java.util.Scanner;
import java.io.File; //TEMPORANEO
import java.io.PrintWriter; //TEMPORANEO

public class IntegerToRoman{

    public static void main( String[] args ) {

        //stampaInFile();
        Scanner in = new Scanner(System.in);
        System.out.print("\nINSERISCI NUMERO: ");
        int num = in.nextInt();
        in.close();

        numUni(num);
        System.out.print("\n");
    }
    public static String convert(int number){
       return numUni(number);
   }

//!!!!!! REALIZZARE FUNZIONE DI CONTROLLO DI CORRETTEZZA DI INPUT

    public static String numUni(int num_uni){
        //System.out.printf("  Uni:");
        String aux="";
        switch (num_uni){
            case (1): aux="I"; break;
            case (2): aux="II"; break;
            case (3): aux="III"; break;
            //default: SERVE?
        }
        return aux;
    }
}
