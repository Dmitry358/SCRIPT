////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.String;

public class IntegerToRoman{

    public static String convert(int number){
       return numUni(number);
   }

//!!!!!! REALIZZARE FUNZIONE DI CONTROLLO DI CORRETTEZZA DI INPUT

    public static String numUni(int num_uni){
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
