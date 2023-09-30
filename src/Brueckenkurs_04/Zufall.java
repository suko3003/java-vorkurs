package Brueckenkurs_04;

public class Zufall {
    public static void main(String[] args) {
        int playerAmount = 3;
        int rolls = 6;
        int diceMaxValue = 6;
        printPlayerRolls(playerAmount, rolls, diceMaxValue, false);
    }

    private static void printPlayerRolls(int playerAmount, int rolls, int diceMaxValue, boolean diceWithZero) {
        int[][] turn = new int[playerAmount][rolls];

        for (int playerCount = 0; playerCount < playerAmount; playerCount++) {
            System.out.println("Spieler: " + playerCount);

            for (int rollCount = 0; rollCount < rolls; rollCount++) {
                turn[playerCount][rollCount] = rollDice(diceMaxValue, diceWithZero);

                System.out.print(turn[playerCount][rollCount] + " ");
            }

            System.out.println();
            System.out.println();
        }
    }

    private static int rollDice(int maxValue, boolean withZero) {
        return (int) (Math.random() * maxValue) + (!withZero ? 1 : 0);
    }
}
