package Brueckenkurs_03;

import java.util.ArrayList;
import java.util.List;

public class Client {
    // private Attribut
    private final int Anzahl; // Integer
    // Konstruktor

    public Client() {
        Anzahl = 1;
    }

    public static void main(String[] args) {
        Client clientClass = new Client();
        System.out.println(clientClass.Anzahl);

        Student studentClass = new Student();
        // print alter
        System.out.println(studentClass.getAlter());
        // change alter
        studentClass.setAlter(23);
        // print again
        System.out.println(studentClass.getAlter());

        // change alter
        studentClass.setAlter(18);
        // print again
        System.out.println(studentClass.getAlter());

        Student student1 = new Student(23, "Hans-Peter Muster");

        System.out.println("Student "
                + student1.getName()
                + " ist "
                + student1.getAlter()
                + " Jahre alt.");

        List<Student> studentenVerzeichnis = new ArrayList<Student>();

        studentenVerzeichnis.add(student1);
        studentenVerzeichnis.add(studentClass);

        // for (int i = 0; i < 2; i++) {
        // // Studenten informationen einlesen
        // String name = In.readLine("Name des Student: ");
        // int studentAlter = In.readInt("Alter des Student: ");
        //
        // // studenten Eintrag erzeugen
        // Student addStudent = new Student(studentAlter, name);
        //
        // // addStudent in das Verzeichnis hinzufügen
        // studentenVerzeichnis.add(addStudent);
        // }

        System.out.println("=======================");
        System.out.println("Studentenverzeichnis");
        System.out.println("=======================");

        for (int i = 0; i < studentenVerzeichnis.size(); i++) {
            System.out.println("Student "
                    + studentenVerzeichnis.get(i).getName()
                    + " ist "
                    + studentenVerzeichnis.get(i).getAlter()
                    + " Jahre alt.");
        }

        //
        int matrix[][] = new int[3][3];

        /*
         * 135 # #
         * # 5 #
         * 3 # #
         */
        /*
         * 135 # 3
         * # 5 #
         * # # #
         */

        matrix[0][0] = 135;

        matrix[1][1] = 5;

        matrix[2][0] = 3;

        /*
         * -> y
         * x 135 # 3
         * | # 5 #
         * v # # #
         */
        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {
                System.out.print(matrix[x][y] + " ");
            }

            System.out.println();

        }

        int z = 5 ^ 3 | 4 & 5;

        z = Integer.MIN_VALUE & 0x8000_0000;
        z = z >> 31;

        System.out.println("Vorzeichen:" + z);

    }

}
