////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static it.unipd.mtss.RomanPrinter.printAsciiArt;
import static org.junit.Assert.assertTrue; //DA CHIARIRE SE SERVE

import org.junit.Before;
import org.junit.Test;

public class RomanPrinterTest {
//testPrintInConsole??
    //romannumber == null
    //romannumber == ""
    //romannumber != I,V,X,L,C,D,M

    @Before //SERVE??
    public void inizializzazione() { //SERVE???
        RomanPrinter a = new RomanPrinter();
    }

    @Test
    public void testPrintAscciArt_I(){
        printAsciiArt("I");
    }

    @Test
    public void testPrintAsciiArt(){
        String romaNumber = "I";
        String expected = "";
        String aux = printAsciiArt(romaNumber);
        assertTrue("I".equals(aux));
    }

    @Test
    public void test_2(){
        String aux = printAsciiArt("II");
        assertTrue("II".equals(aux));
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