package Brueckenkurs_02;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // TODO write some fancy code
        // f(a,b) = (a + b) / 2

        //
        // functionF (a,b) = f(a,b)
        // => f(2.5, 3.141) = 2.8205

        System.out.println(functionF(65.5, 376.141));
        System.out.println(functionF(6.5, 37446.141));
        System.out.println(functionF(65.5, 3376.141));
        System.out.println(functionF(3, 8742.141));

        Display(functionF(3, 8742.141));

        // Einlesen von Daten über die Konsole
        int alter = In.readInt("Wie Alt bist du?");

        System.out.println("Eingegebenes Alter: " + alter);

        // Parameter für mathematische Funktion einlesen

        // double a = In.readDouble("Parameter a fuer f(a,b): ");
        // double b = In.readDouble("Parameter b fuer f(a,b): ");
        // Ergebnis auf der Konsole ausgeben
        // Display( functionF(a, b) );

        if (alter > 17) {
            System.out.println("Du bist volljaehrig!");
        } else {
            System.out.println("Du bist minderjaehrig!");
        }

        String text = "Neue Zeichenkette.!!!11elf";

        text = text + " hier kommt noch etwas angehaengt.";

        text = text + alter;

        System.out.println(text);

        int fixesAlter = 18;

        Display(fixesAlter);

        Display(text);
    }

    public static void Display(String a) {
        System.out.println("Parameter (String) a = " + a);
    }

    public static void Display(double a) {
        System.out.println("Parameter (double) a = " + a);
    }

    public static void Display(int a) {
        System.out.println("Parameter (int) a = " + a);
    }

    public static double functionF(double a, double b) {
        return ((a + b) / 2.1);
    }

    public static double Add(double a, double b) {
        return a + b;
    }

    public static int Add(int a, int b) {
        return a + b;
    }

}
