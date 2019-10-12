import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private Card card;
    private ArrayList<Card> cards;
    private ArrayList<String> suits;
    private Player player;


    public Deck(){
        this.cards = new ArrayList<Card>();

    }

    public int cardCount() {
        return this.cards.size();
    }


    public void addCardToDeck(Card cardParam) {
        this.cards.add(cardParam);

    }

    public int populateDeck() {
        for (SuitType suit : SuitType.values() ) {
            SuitType suit1 = suit;
            for (RankType rank : RankType.values()) {
                RankType rank1 = rank;
                Card newCard = new Card(suit1, rank1);
                this.cards.add(newCard);
            }

        }
        return cardCount();
    }

    public boolean shuffle() {
        Card unshuffledFirstCard = this.cards.get(0);
        Collections.shuffle(this.cards);
        Card shuffledFirstCard = this.cards.get(0);

        if (unshuffledFirstCard != shuffledFirstCard) {
            return true;
        }
        return false;
    }

    public Card getCardFromDeck() {
        return this.cards.get(0);
    }

    public ArrayList<Card> getFourCardsFromDeck() {
        ArrayList<Card> cards = new ArrayList<Card>();
        Card card1 = this.cards.get(0);
        Card card2 = this.cards.get(1);
        Card card3 = this.cards.get(2);
        Card card4 = this.cards.get(3);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        return cards;
    }


}
