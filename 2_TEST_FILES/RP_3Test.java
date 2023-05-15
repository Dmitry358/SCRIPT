////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static it.unipd.mtss.RomanPrinter.printAsciiArt;
//import static java.util.Objects.isNull;
import static org.junit.Assert.assertTrue; //DA CHIARIRE SE SERVE


import org.junit.Before;
import org.junit.Test;

public class RomanPrinterTest {
//testPrintInConsole??
    //romannumber == null
    //romannumber == ""
    //romannumber != I,V,X,L,C,D,M
    //test minusculi I,V,X,L,C,D,M

    @Before //SERVE??
    public void inizializzazione() { //SERVE???
        RomanPrinter a = new RomanPrinter();
    }

    @Test
    public void testPrintAscciArt_I(){ printAsciiArt("I"); }


    @Test //!!!DA RIVEDERE!!!!
    public void testPrintAsciiArt_conEmptyString(){
        String romanNumber = "";
        //String expected = "";
        String aux = printAsciiArt(romanNumber);
        assertTrue(aux == null);
    }
    @Test //!!!DA RIVEDERE!!!!
    public void testPrintAsciiArt_conNullString(){
        String romanNumber = null;
        //String expected = "";
        String aux = printAsciiArt(romanNumber);
        assertTrue(aux == null);
    }

    @Test
    public void testPrintAsciiArt_con_I(){
        String romanNumber = "I";
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";
        String aux = printAsciiArt(romanNumber);
        assertTrue(expected.equals(aux));
    }

    @Test
    public void testPrintAsciiArt_con_II(){
        String romanNumber = "II";
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n"+
                          " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";

        String aux = printAsciiArt(romanNumber);
        assertTrue(expected.equals(aux));
    }



    /*
    @Test
    public static boolean arrayConfront(A,B){

        boolean aux=true;
        for(int i=0; i < numRig && aux; i++) {
            for(int j=0; j < numCol && aux; j++) {
                if(A[i][j] != B[i][j]) aux=false;
            }
         }
         return aux;
    }
    */
}