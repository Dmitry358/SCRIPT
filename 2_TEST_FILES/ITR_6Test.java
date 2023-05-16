////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////


////////////////////   V-6   ////////////////////


package it.unipd.mtss;

import static it.unipd.mtss.IntegerToRoman.convert;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class IntegerToRomanTest{
    //!!!!! TESTARE IL COSTRUTTORE ?????
    //TESTING: numUni, numDec, numCent, convert: <1; >1000;
    // esempi ammissibili per partizoni


    @Test //?????? DA SOSTITUIRE "assertTrue"
    //!!!!!!!!!!!!!!! DA REALIZZARE !!!!!!!!!!!!!!!!!!!!!!!
    public void testConvert_ConInputLettera(){
        String expected = null;
        char lettera = 'a';
        boolean correct = true;

        String result = convert(lettera);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputMenoCinquanta(){
        String expected = null;
        int number = -50;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputZero(){
        String expected = null;
        int number = 0;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test
    public void testConvert_ConInputUno(){
        String expected = "I";
        int number = 1;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testConvert_ConInputDue(){
        String expected = "II";
        int number = 2;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test
    public void testConvert_ConInputTre(){
        String expected = "III";
        int number = 3;

        String result = convert(number);

        assertTrue(expected.equals(result));
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputQuattro(){
        String expected = null;
        int number = 4;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }

    @Test //?????? DA SOSTITUIRE "assertTrue"
    public void testConvert_ConInputMilleUno(){
        String expected = null;
        int number = 1001;
        boolean correct = true;

        String result = convert(number);
        if(expected != result) { correct = false;}

        assertTrue(correct);
    }


}
