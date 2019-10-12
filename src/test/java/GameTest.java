import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    private Deck deck;
    private Game game1;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new Player("Andy", false);
        player2 = new Player("Steve", true);
        game1 = new Game();

    }

    @Test
    public void canDealCardToPlayer() {
        game1.dealCardToPlayer(deck, player1);
        assertEquals(1, player1.getHandCount());
    }
    @Test
    public void canDealTwoCardsToPlayer() {
        game1.dealCardToPlayer(deck, player1);
        game1.dealCardToPlayer(deck, player1);
        assertEquals(2, player1.getHandCount());
    }
    @Test
    public void canReceiveFourCardsFromDeck() {
        assertEquals(4, game1.receiveFourCardsFromDeck(deck).size());
    }

    @Test
    public void canDealTwoCardsToEachPlayer() {
        game1.giveTwoCardsToEachPlayer(deck, player1, player2);
        assertEquals(2, player1.getHandCount());
        assertEquals(2, player2.getHandCount());
    }

    @Test
    public void canPlaySingleRound() {
        assertEquals("player 2 wins",game1.playSingleRound(deck, player1, player2));
    }

//    @Test
//    public void canGetValueOfPlayersHand {
//        assertEquals(15, player1.get);
//    }

}
