package Brueckenkurs_04;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Zahlen möchten Sie eingeben?");
        int anzahl = scanner.nextInt();

        double[] numbers = new double[anzahl];

        System.out.println("Geben Sie die Zahlen ein:");
        for (int i = 0; i < anzahl; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Der Höchstwert beträgt: " + calcMax(numbers));
        System.out.println("Der niedrigste Wert beträgt: " + calcMin(numbers));

        double average = calcAverage(numbers);
        System.out.println("Der Durchschnitt beträgt: " + average);

        double sumAddition = calcAddition(numbers);
        System.out.println("Die Addition ergibt: " + sumAddition);

        double sumSubstraction = calcSubtraction(numbers);
        System.out.println("Die Subtraktion ergibt: " + sumSubstraction);

        double sumMultiplication = calcMultiplication(numbers);
        System.out.println("Die Multiplikation ergibt: " + sumMultiplication);

        double sumDivision = calcDivision(numbers);
        System.out.println("Die Division ergibt: " + sumDivision);

        scanner.close();
    }

    private static double calcMin(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    private static double calcMax(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    private static double calcAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    private static double calcAddition(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }

    private static double calcSubtraction(double[] numbers) {
        double sum = 0;
        int index = 0;
        for (double number : numbers) {
            if (index == 0 || sum == 0) {
                sum = number;
                index++;
                continue;
            }
            sum -= number;
        }

        return sum;
    }

    private static double calcMultiplication(double[] numbers) {
        double result = 0;
        int index = 0;
        for (double number : numbers) {
            if (index == 0) {
                result = number;
                index++;
                continue;
            }
            result *= number;
        }

        return result;
    }

    private static double calcDivision(double[] numbers) {
        double result = 0;
        int index = 0;
        for (double number : numbers) {
            if (index == 0 || number == 0) {
                result = number;
                index++;
                continue;
            }
            result /= number;
        }
        return result;
    }
}
