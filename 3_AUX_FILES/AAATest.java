////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.lang.String;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import static it.unipd.mtss.AAA.print_I;
import static it.unipd.mtss.AAA.print_V;
import static it.unipd.mtss.AAA.print_X;
import static it.unipd.mtss.AAA.print_L;
import static it.unipd.mtss.AAA.print_C;
import static it.unipd.mtss.AAA.print_D;
import static it.unipd.mtss.AAA.print_M;


public class AAATest {

    @Before
    public void init() { AAA aaa = new AAA(); }

    @Test
    public void zzz(){
        String str1 = "";
        String str2 = null;

        System.out.printf(str1+"aaa\n");
        System.out.printf(str2+"bbb\n");


        if(str1.isEmpty()) System.out.printf("str1 = isEmpty \n");
        else System.out.printf("str1 = isNOTEmpty \n");

        if(str1 == null) System.out.printf("str1 == null \n");
        else System.out.printf("str1 = isNOTNULL \n");

        if(str2 == null) System.out.printf("str2 == null \n");
        else System.out.printf("str2 = isNOTNULL \n");

        //assertEquals("I",print_I());
    }



    @Test
    public void mainPrint_I(){ assertEquals("I",print_I()); }

    @Test
    public void mainPrint_V(){ assertEquals("V",print_V()); }

    @Test
    public void mainPrint_X(){ assertEquals("X", print_X()); }

    @Test
    public void mainPrint_L(){ assertEquals("L",print_L()); }

    @Test
    public void mainPrint_C(){ assertEquals("C",print_C()); }

    @Test
    public void mainPrint_D(){ assertEquals("D",print_D()); }

    @Test
    public void mainPrint_M(){ assertEquals("M",print_M()); }

}
