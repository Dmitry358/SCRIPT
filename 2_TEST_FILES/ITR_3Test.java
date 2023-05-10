package it.unipd.mtss;

import org.junit.Test;

import static it.unipd.mtss.IntegerToRoman.numUni;
import static org.junit.Assert.assertTrue;

public class IntegerToRomanTest{

    @Test
    public void test_1(){
        String aux = numUni(1);
        assertTrue("I".equals(aux));
    }

    @Test
    public void test_2(){
        String aux = numUni(2);
        assertTrue("II".equals(aux));
    }

    @Test
    public void test_3(){
        String aux = numUni(3);
        assertTrue("III".equals(aux));
    }
}
