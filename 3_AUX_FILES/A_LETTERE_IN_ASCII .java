////////////////////////////////////////////////////////////////////
// Giulia Doria 2021561
// Dmitry Pluzhnikov 1169886
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class AAA {

    public static String print_I() {
        String str_I = " _____\n"+
                       "|_   _|\n"+
                       "  | |\n"+
                       "  | |\n"+
                       " _| |_\n"+
                       "|_____|\n";

        System.out.println(str_I);
        return str_I;
    }

    public static String print_V() {
        String aux = "__      __\n"+
                     "\\ \\    / /\n"+
                     " \\ \\  / /\n"+
                     "  \\ \\/ /\n"+
                     "   \\  /\n"+
                     "    \\/\n";

        System.out.println(aux);
        return "V";
    }

    public static String print_X() {
        String aux = "__    __\n"+
                     "\\ \\  / /\n"+
                     " \\ \\/ /\n"+
                     "  > <\n"+
                     " / . \\\n"+
                     "/_/ \\_\\\n";

        System.out.println(aux);
        return "X";
    }

    public static String print_L() {
        String aux = " _ \n"+
                     "| |\n"+
                     "| |\n"+
                     "| |\n"+
                     "| |____\n"+
                     "|______|\n";

        System.out.println(aux);
        return "L";
    }

    public static String print_C() {
        String aux = "  _____\n"+
                     " / ____|\n"+
                     "| |\n"+
                     "| |\n"+
                     "| |____\n"+
                     " \\_____|\n";

        System.out.println(aux);
        return "C";
    }

    public static String print_D() {
        String aux = " _____\n"+
                     "|  __ \\\n"+
                     "| |  | |\n"+
                     "| |  | |\n"+
                     "| |__| |\n"+
                     "|_____/\n";

        System.out.println(aux);
        return "D";
    }

    public static String print_M() {
        String aux = " __  __\n"+
                     "|  \\/  |\n"+
                     "| \\  / |\n"+
                     "| |\\/| |\n"+
                     "| |  | |\n"+
                     "|_|  |_|\n";

        System.out.println(aux);
        return "M";
    }

}
