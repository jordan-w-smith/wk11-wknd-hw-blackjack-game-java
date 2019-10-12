import java.util.ArrayList;
import java.util.Collections;

public class Game {

    Deck deck;

    public Game() {

    }

    public void dealCardToPlayer(Deck deck, Player player) {
        deck.populateDeck();
        deck.shuffle();
        Card cardFromDeck = deck.getCardFromDeck();
        player.addCardToHand(cardFromDeck);
    }

//    public void dealTwoCardsToPlayer() {
//
//    }

    public ArrayList<Card> receiveFourCardsFromDeck(Deck deck) {
        deck.populateDeck();
        deck.shuffle();
        ArrayList<Card> cards = new ArrayList<Card>(deck.getFourCardsFromDeck());
//        cards.add(deck.getFourCardsFromDeck().get(0));
        return cards;
    }

    // function to deal 2 cards to each of 2 participating players

    public void giveTwoCardsToEachPlayer(Deck deck, Player player1, Player player2) {
        ArrayList<Card> cardsToDeal = receiveFourCardsFromDeck(deck);
        player1.addCardToHand(cardsToDeal.get(0));
        player1.addCardToHand(cardsToDeal.get(1));
        player2.addCardToHand(cardsToDeal.get(2));
        player2.addCardToHand(cardsToDeal.get(3));
    }

    public String winnerCheck(Deck deck, Player player1, Player player2) {
        int p1HandVal = player1.getValueOfPlayersHand();
        int p2HandVal = player2.getValueOfPlayersHand();
        if (p1HandVal > 21) {
            return "player 1 loses";
        }
        else if (p2HandVal > 21) {
            return "player 2 loses";
        }
        else if (p1HandVal > p2HandVal) {
            return "player 1 wins";
        }
        else if (p2HandVal > p1HandVal) {
            return "player 2 wins";
        }
        else if (p1HandVal == p2HandVal) {
            return "its a draw";
        }
        else {
            return "Result not expected js";
        }
    }

    public String playSingleRound(Deck deck, Player player1, Player player2) {
        giveTwoCardsToEachPlayer(deck, player1, player2);
        return winnerCheck(deck, player1, player2);
    }

}
