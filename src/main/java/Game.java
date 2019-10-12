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

}
