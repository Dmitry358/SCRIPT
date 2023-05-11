////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String printAsciiArt(String romanNumber) {
        if (romanNumber == "I") {
            return "I";
        }
        return "II";
    }

/*

   //metod
   public static String print(int num) {
       return printAsciiArt(IntegerToRoman.convert(num));
   }
   



    //metod
    public static void printAsciiArt2(String romanNumber) {
        if (romanNumber == "I") {
            System.out.printf("  _____\n ");
            System.out.printf("|_   _|\n");
            System.out.printf("   | |\n");
            System.out.printf("   | |\n");
            System.out.printf("  _| |_\n");
            System.out.printf(" |_____|\n");
            
        }


    }
*/
}