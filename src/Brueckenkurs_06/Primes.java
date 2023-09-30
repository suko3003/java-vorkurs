package Brueckenkurs_06;

public class Primes {
    public static void main(String[] args) {
        printPrimes(100);
    }

    public static void printPrimes(int limit) {
        for (int numberToTest = 2; numberToTest <= limit; numberToTest++) {
            boolean isDivisible = false;
            for (int i = 2; i < 5; i++) {
                if ((numberToTest % i) == 0) {
                    isDivisible = true;
                }
            }
            if (!isDivisible) {
                System.out.println("Primzahl: " + numberToTest);
            }
        }
    }
}
