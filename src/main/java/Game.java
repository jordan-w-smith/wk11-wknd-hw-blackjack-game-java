public class Game {

    private Game game;

    public Game() {

    }

    public void dealCardToPlayer(Deck deck, Player player) {
        deck.populateDeck();
        deck.shuffle();
        Card cardFromDeck = deck.getCardFromDeck();
        player.addCardToHand(cardFromDeck);
    }

    public void dealTwoCardsToPlayer() {

    }

}
