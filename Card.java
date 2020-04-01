/***
 * This class creates individual cards. It takes in a random number between 1
 * and 52 and uses that number to create a card with a suit, rank, and value. I
 * also give the the cards full names, like "Seven of Hearts" as well as simply
 * "7H."
 */
public class Card {

    public String suit, suitShort, rank, rankShort;
    public int value;

    /***
     * This is the card constructor. It takes in a random number and outputs a card.
     */
    public Card(int num) {
        int newNumber;

        /*
         * This determines the suit and uses the modulo operation to find a newNumber,
         * which is only between 1 and 13.
         */
        if (num / 39 > 0) {
            suit = "Hearts";
            suitShort = "H";
            newNumber = num % 39 + 1;
        } else if (num / 26 > 0) {
            suit = "Clubs";
            suitShort = "C";
            newNumber = num % 26 + 1;
        } else if (num / 13 > 0) {
            suit = "Diamonds";
            suitShort = "D";
            newNumber = num % 13 + 1;
        } else {
            suit = "Spades";
            suitShort = "S";
            newNumber = num + 1;
        }

        /*
         * This determines the rank of the card. I recognize it would have been faster
         * sending the newNumber directly to the rank, with exceptions for 1, 11, 12,
         * and 13, but I wanted to be able to express the cards in full words.
         */
        if (newNumber == 1) {
            rank = "Ace";
            rankShort = "A";
        } else if (newNumber == 2) {
            rank = "Two";
            rankShort = "2";
        } else if (newNumber == 3) {
            rank = "Three";
            rankShort = "3";
        } else if (newNumber == 4) {
            rank = "Four";
            rankShort = "4";
        } else if (newNumber == 5) {
            rank = "Five";
            rankShort = "5";
        } else if (newNumber == 6) {
            rank = "Six";
            rankShort = "6";
        } else if (newNumber == 7) {
            rank = "Seven";
            rankShort = "7";
        } else if (newNumber == 8) {
            rank = "Eight";
            rankShort = "8";
        } else if (newNumber == 9) {
            rank = "Nine";
            rankShort = "9";
        } else if (newNumber == 10) {
            rank = "Ten";
            rankShort = "10";
        } else if (newNumber == 11) {
            rank = "Jack";
            rankShort = "J";
        } else if (newNumber == 12) {
            rank = "Queen";
            rankShort = "Q";
        } else if (newNumber == 13) {
            rank = "King";
            rankShort = "K";
        }

        // This sets the value of the cards.
        if (newNumber > 10) {
            value = 10;
        } else {
            value = newNumber;
        }

    }

}
