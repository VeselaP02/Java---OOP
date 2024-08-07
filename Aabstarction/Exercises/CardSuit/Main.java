package Aabstarction.Exercises.CardSuit;


public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (CardSuit cardsuit:CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardsuit.ordinal(),cardsuit.name());
        }
    }
}
