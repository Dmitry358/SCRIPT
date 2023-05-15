////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    private static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }


    public static String printAsciiArt(String romanNumber) {
        String stringaAscii = "";
        boolean correctInput = true;

        if(romanNumber == null) correctInput = false;

        else if(romanNumber.length() < 1 && romanNumber.length() > 3) correctInput = false;

        for (int i=0; i < romanNumber.length() && correctInput; i++){
            if(romanNumber.charAt(i) == 'I') stringaAscii += print_I();
            else correctInput = false;
        }

        return correctInput ? stringaAscii : null;
    }

    private static String print_I() {
        String str_I = " _____\n"+
                       "|_   _|\n"+
                       "  | |\n"+
                       "  | |\n"+
                       " _| |_\n"+
                       "|_____|\n";

        System.out.println(str_I);
        return str_I;
    }



}