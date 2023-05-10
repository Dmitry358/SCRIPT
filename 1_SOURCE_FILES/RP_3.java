package it.unipd.mtss;

public class RomanPrinter {
   //metod
    public static void main(String[] args) {
        printAsciiArt2("I");
    }
   
   //metod
   public static String print(int num) {
       return printAsciiArt(IntegerToRoman.convert(num));
   }
   
   //metod
   private static String printAsciiArt(String romanNumber) {
       if (romanNumber == "I") {
           System.out.printf("a " + " _____ ");
           System.out.printf("|_   _|");
       }
       //TODO
       return null;
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
        //TODO

    }
}