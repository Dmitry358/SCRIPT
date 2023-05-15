////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Before;
import org.junit.Test;

import static it.unipd.mtss.IntegerToRoman.convert;
import static it.unipd.mtss.IntegerToRoman.numUni;
import static org.junit.Assert.assertTrue;

public class IntegerToRomanTest{
    //TESTING: numUni, numDec, numCent, convert: <1; >1000;
    // esempi ammissibili per partizoni

    @Before//!!!!!!!!!!!!! SERVE???
    public void inizializzazione() {
        IntegerToRoman a = new IntegerToRoman();
    }

    @Test
    public void testConvert_InputMinoreDiUno(){
        String aux = convert(1);
        assertTrue("I".equals(aux));
    }

    @Test
    public void testConvert_InputMaggioreDiMille(){
        String aux = convert(2);
        assertTrue("II".equals(aux));
    }

    @Test
    public void test_3(){
        String aux = convert(3);
        assertTrue("III".equals(aux));
    }


/*
    @Test
    public void test_4(){
        String aux = numUni(1);
        assertTrue("I".equals(aux));
    }

    @Test
    public void test_5(){
        String aux = numUni(2);
        assertTrue("II".equals(aux));
    }

    @Test
    public void test_6(){
        String aux = numUni(3);
        assertTrue("III".equals(aux));
    }
*/

}
