package Aabstarction.Exercises.Cards_with_Power;


public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower(){
        return cardRank.getRankPower() + cardSuit.getSuitPower();
    }


}
