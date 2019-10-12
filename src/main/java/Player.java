import java.util.ArrayList;

public class Player {


        private ArrayList<Card> hand;
        private String name;
        private Card card;
        private Boolean isDealer;


        public Player(String name, Boolean isDealer) {
            this.name = name;
            this.hand = new ArrayList<Card>();
            this.isDealer = isDealer;
        }


        public String getName() {
            return this.name;
        }

        public int getHandCount() {
            return this.hand.size();

        }

//        public int receiveCard(Card card) {
//            this.cards.add(card);
//            return this.cards.size();
//        }

        public boolean checkIfDealer() {
            return this.isDealer;
        }

        public void addCardToHand(Card card) {
            this.hand.add(card);
        }

        // get value of players hand

        public int getValueOfPlayersHand() {
            return this.hand.get(0).getRankValue() + this.hand.get(1).getRankValue();
        }
}

