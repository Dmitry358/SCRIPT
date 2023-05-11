////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static it.unipd.mtss.RomanPrinter.printAsciiArt;
import static org.junit.Assert.*; //DA CHIARIRE SE SERVE
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void test_1(){
        String aux = printAsciiArt("I");
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