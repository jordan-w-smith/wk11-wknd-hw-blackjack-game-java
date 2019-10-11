import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card1;
    private Player player1;

    @Before
    public void before() {
        deck = new Deck();
        card1 = new Card(SuitType.DIAMONDS, RankType.NINE);
        player1 = new Player("Andy", true);
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCardToDeck() {
        deck.addCardToDeck(card1);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffleCards() {
        deck.populateDeck();
        assertEquals(true, deck.shuffle());
    }

    @Test
    public void canGetTwoCardsFromDeck() {
        deck.getTwoCardsFromDeck();
        assertEquals(2, canGetTwoCardsFromDeck());
    }

//    @Test
//    public void canDeal() {
//        deck.populateDeck();
//        deck.deal(player1);
//        assertEquals(1, player1.getHandCount());
//    }






}
