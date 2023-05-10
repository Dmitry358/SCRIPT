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

        numUni(num);
        System.out.print("\n");
    }
	
	public static String convert(int number){
        // TODO
        return null;
    }

//!!!!!! REALIZZARE FUNZIONE DI CONTROLLO DI CORRETTEZZA DI INPUT

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
			case (10): System.out.printf("X"); break;
        }
    }
}
