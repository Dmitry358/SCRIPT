////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static it.unipd.mtss.RomanPrinter.printAsciiArt;
import static it.unipd.mtss.RomanPrinter.print_I;

import static org.junit.Assert.assertTrue; //DA CHIARIRE SE SERVE
import org.junit.Test;
//import org.junit.Before;

public class RomanPrinterTest {
    //come testare STAMPA IN CONSOLE di "print_I" e "PrintAsciiArt"
    //!!!!! TEST COSTRUTTORE???
    //romannumber == null
    //romannumber == ""
    //romannumber != I,V,X,L,C,D,M
    //test minusculi I,V,X,L,C,D,M
    //STAMPA DIVERSE COMBINAZIONI DI LETTERE: SOLO GIUSTE E GIUSTE CON SBAGLIATE
    //TUTTI TEST DI "PrintAscciArt" ANCHE PER "String print(int num)"


    @Test
    public void testPrintAsciiArt_conStringaNulla(){
        String romanNumber = null;
        String expected = null;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test
    public void testPrintAsciiArt_conStringaVuota(){
        String romanNumber = "";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test // ???? INCLUDERE NEL "testPrintAsciiArt_conCaratteriNonAmmessi"
    public void testPrintAsciiArt_con_i_Minuscolo(){
        String romanNumber = "i";
        String expected = null ;

        String result = printAsciiArt(romanNumber);

        assertTrue(expected == result);
    }

    @Test //!!!!!!!! DA RICONTROLLARE
    public void testPrintAsciiArt_conCaratteriNonAmmessi(){
        String alfabeto = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuvwxyz";
        String expected = null;
        boolean fail = false;

        for(int i = 0; !fail && i < alfabeto.length(); i++){
            String result = printAsciiArt(String.valueOf(alfabeto.charAt(i)));
            if(expected != result){ fail = true; }
        }

        assertTrue(!fail);
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

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
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

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrintAsciiArt_con_III(){
        String romanNumber = "III";
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
                          "|_____|\n"+
                          " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";

        String result = printAsciiArt(romanNumber);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testPrint_I(){
        String expected = " _____\n"+
                          "|_   _|\n"+
                          "  | |\n"+
                          "  | |\n"+
                          " _| |_\n"+
                          "|_____|\n";
        String result = print_I();
    }

}