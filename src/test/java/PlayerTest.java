import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Deck deck;
    private Card card1;
    private Card card2;

    @Before
    public void before() {
        player1 = new Player("Tom", true);
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.FIVE);
        card2 = new Card(SuitType.HEARTS, RankType.SIX);
    }

    @Test
    public void hasName() {
       assertEquals("Tom", player1.getName());
   }

    @Test
    public void checkDealerStatus() {
        assertEquals(true, player1.checkIfDealer());
    }

    @Test
    public void canCountHand() {
        assertEquals(0, player1.getHandCount());
    }

    @Test
    public void canAddToHand() {
        player1.addCardToHand(card1);
        assertEquals(1, player1.getHandCount());
    }

    @Test
    public void canGetValueOfHand() {
        player1.addCardToHand(card1);
        player1.addCardToHand(card2);
        assertEquals(11, player1.getValueOfPlayersHand());
    }



}
