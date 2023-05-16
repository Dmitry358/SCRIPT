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

//---------------- numUni BEGIN----------------------

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testNumUni_ConInputMenoCinquanta(){
        String expected = null;
        int number = -50;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testNumUni_ConInputZero(){
        String expected = null;
        int number = 0;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test
    public void testNumUni_ConInputUno(){
        String expected = "I";
        int number = 1;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testNumUni_ConInputDue(){
        String expected = "II";
        int number = 2;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testNumUni_ConInputTre(){
        String expected = "III";
        int number = 3;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testNumUni_InputQuattro(){
        String expected = null;
        int number = 4;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testNumUni_InputMilleUno(){
        String expected = null;
        int number = 1001;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

//---------------- numUni END----------------------

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
