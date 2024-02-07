/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void genArray(int[] filledArray) {
        int value = 2;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = value;
            value += 2;
        }
    }

    private static void printFilteredArrayContent(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 3 == 0) {
                copiedArray[i] = 0;
            }
        }
        printArray(copiedArray);
    }

    private static void genNewArrayContent(int[] workArray) {
        int[] helpArray = new int[20];
        int value = 4;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = value;
            value += 4;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    private static void printArray(int[] workArray) {
        for (int i = workArray.length - 1; i > 0; i--) {
            System.out.print(workArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] filledArray = new int[20];
        genArray(filledArray);
        printArray(filledArray);

        printFilteredArrayContent(filledArray);
        printArray(filledArray);

        filledArray[0] = 1000;
        printArray(filledArray);

        genNewArrayContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Frage 1:
    // Es geht ausser der Index, deswegen kann es nicht eingelesen wird.
    // Zum Vermeiden  int i = workArray.length-1 Zeile 36.
    //Frage 2:
    // Die Methode arbeitet mit der Referenz des Arrays und verändert dadurch das Array.
    // Somit ist ein Rückgabewert nicht erforderlich.Die void Methoden geben nichts zurück, weil die kein return haben.
    //Frage 3:
    //  Es wird nur die Referenz kopiert, dadurch verändert die Methode auch das Array workArray.
    //Frage 4:
    // Frage 4: In Zeile 50 wird filledArray verändert und in Zeile 54 ausgegeben.
    // Die Methode genNewArrayContent verändert das filledArray nicht, sie übernimmt nur den Inhalt des Arrays.
}

/*
1. Integer oder kleiner (Byte, Short und Char).
2. Nein, ein Array wird mit den entsprechenden Werten automatisch initialisiert
(String = null, Boolean = false, Integer = 0,...).Jedes Datentyp hat eigene default Wert.
3.  Durch das kopieren eines Arrays in ein größeres Array mithilfe einer Schleife oder
der Methode System.arraycopy,unter der benützung der ArrayList Klasse,
oder mit der Methode Arrays.copyOf(). Falls wir angegebene array.length hätten, könnten wir nicht verändern.
4. Ich benütze die Methode System.arraycopy, oder durchlaufe das Array mithilfe einer Schleife
und weise jedes Element einzeln einem neuen Array zu. Wir erstellen ein neues Array mit der gleichen Länge.
Dann gleichen wir das zu gewünschten Array zu.
5. Ja
6. Nein, da nur die Referenz verglichen wird.
 */