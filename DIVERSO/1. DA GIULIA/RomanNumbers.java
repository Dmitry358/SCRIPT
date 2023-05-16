public class RomanNumbers {
    public static void main(String[] args) {
        int givenNumber = 976;

        if (givenNumber > 0 && givenNumber <= 1000) {
            // ch contiene i simboli che verranno utilizzati per scrivere i umeri romani: I
            // V X L C D M
            String[] ch = { "", "I", "V", "X", "L", "C", "D", "M" };
            // art0, art1 etc rappresentano ognuno i simboli di ch in asciiart
            String[] art0 = { "", "", "", "", "", "", "" };
            String[] art1 = { " _____ ", "|_   _|", "  | |  ", "  | |  ", " _| |_ ", "|_____|" };
            String[] art2 = { "__      __", "\\ \\    / /", " \\ \\  / / ", "  \\ \\/ /  ", "   \\  /   ",
                    "    \\/    " };
            String[] art3 = { "__   __", "\\ \\ / /", " \\ V / ", "  > <  ", " / . \\ ", "/_/ \\_\\" };
            String[] art4 = { " _      ", "| |     ", "| |     ", "| |     ", "| |____ ", "|______|" };
            String[] art5 = { "  _____ ", " / ____|", "| |     ", "| |     ", "| |____ ", " \\_____|" };
            String[] art6 = { " _____  ", "|  __ \\ ", "| |  | |", "| |  | |", "| |__| |", "|_____/ " };
            String[] art7 = { " __  __ ", "|  \\/  |", "| \\  / |", "| |\\/| |", "| |  | |", "|_|  |_|" };

            // asciaart e` un array di array che contiene i simboli di ch ma in asciiart
            String[][] asciiart = { art0, art1, art2, art3, art4, art5, art6, art7 };
            // units tens e hundreds sono i numeri romani relativi a unità decine e
            // centinaia ottenuti combinando i simboli appartenenti a ch[]. L'indice
            // dell'array corrisponde al numero arabico che lo contiene (tens[40]=XL)
            String[] units = { ch[0], ch[1], ch[1] + ch[1], ch[1] + ch[1] + ch[1], ch[1] + ch[2], ch[2], ch[2] + ch[1],
                    ch[2] + ch[1] + ch[1], ch[2] + ch[1] + ch[1] + ch[1], ch[1] + ch[3] };
            String[] tens = { ch[0], ch[1 + 2], ch[1 + 2] + ch[1 + 2], ch[1 + 2] + ch[1 + 2] + ch[1 + 2],
                    ch[1 + 2] + ch[2 + 2], ch[2 + 2], ch[2 + 2] + ch[1 + 2],
                    ch[2 + 2] + ch[1 + 2] + ch[1 + 2], ch[2 + 2] + ch[1 + 2] + ch[1 + 2] + ch[1 + 2],
                    ch[1 + 2] + ch[3 + 2] };
            String[] hundreds = { ch[0], ch[1 + 4], ch[1 + 4] + ch[1 + 4], ch[1 + 4] + ch[1 + 4] + ch[1 + 4],
                    ch[1 + 4] + ch[2 + 4], ch[2 + 4], ch[2 + 4] + ch[1 + 4],
                    ch[2 + 4] + ch[1 + 4] + ch[1 + 4], ch[2 + 4] + ch[1 + 4] + ch[1 + 4] + ch[1 + 4],
                    ch[1 + 4] + ch[3 + 4] };

            String romanNumber = ""; // inizializza la stringa che conterrà il numero romano risultante in caratteri
            String numString = Integer.toString(givenNumber); // converte in stringa il numero arabico dato per poter
                                                              // accedere più facilmente alle singole cifre che lo
                                                              // compongono
            if (numString.length() >= 1) { // se il numero contiene la cifra delle unità
                char indexChar = numString.charAt(numString.length() - 1); // estrae la cifra delle unità
                int index = indexChar - '0'; // converte l'indice ottenuto da char a int
                romanNumber = units[index]; // aggiunge l'eventuale cifra delle unità al numero romano
            }
            if (numString.length() >= 2) {// se il numero contiene la cifra delle decine
                char indexChar = numString.charAt(numString.length() - 2);// estrae la cifra delle decine
                int index = indexChar - '0';// converte l'indice ottenuto da char a int
                romanNumber = tens[index] + romanNumber;// aggiunge l'eventuale cifra delle decine al numero romano
            }
            if (numString.length() >= 3) {// se il numero contiene la cifra delle centinaia
                char indexChar = numString.charAt(numString.length() - 3);// estrae la cifra delle centinaia
                int index = indexChar - '0';// converte l'indice ottenuto da char a int
                romanNumber = hundreds[index] + romanNumber;// aggiunge l'eventuale cifra delle centinaia al numero
                                                            // romano
            }
            if (numString.length() >= 4) {// se il numero contiene la cifra delle migliaia
                romanNumber = ch[7] + romanNumber;// aggiunge l'eventuale cifra delle migliaia al numero
                                                  // romano
            }

            // dato romannumber in lettere ora bisogna stamparlo in ascii art
            int[] indexes = new int[romanNumber.length()]; // l'array indexes conterrà l'indice della lettera romana
                                                           // rispetto all'array ch o asciiart -> esempio numero 20 ->
                                                           // romannumber XX -> index: [3,3]
            for (int i = 0; i < romanNumber.length(); i++) {//
                String romNumChar = Character.toString(romanNumber.charAt(i)); // estrae la singola lettera romana
                for (int j = 0; j < ch.length; j++)
                    if (romNumChar.equals(ch[j]))// la cerca in ch
                        indexes[i] = j;// e la salva in indexes
            }
            for (int i = 0; i < 7; i++) {// per ognuna delle 7 righe di altezza delle asciiart
                for (int j = 0; j < romanNumber.length(); j++) {// e per la larghezza di ogni asciiart
                    System.out.print(asciiart[indexes[j]][i]);// stampa una riga di un'asciiart
                    System.out.print(" ");// separe le asciiart con uno spazio
                }
                System.out.println();// va a capo per ogni riga
            }
        }

    }
}
