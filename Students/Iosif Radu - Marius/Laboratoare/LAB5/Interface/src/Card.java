public class Card {
    private int rank;
    private String suit;

    public final static String DIAMONDS = "romb";
    public final static String CLUBS = "trefla";
    public final static String HEARTS = "inima rosie";
    public final static String SPADES = "inima neagra";

    public final static int TWO = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JOKER = 12;
    public final static int QUEEN = 13;
    public final static int KING = 14;
    public final static int ACE = 15;

    public Card(int rank, String suit) {
        if (TWO <= rank && rank <= ACE) {
            if (suit.equals(DIAMONDS) || suit.equals(CLUBS) || suit.equals(HEARTS) || suit.equals(SPADES)) {
                this.rank = rank;
                this.suit = suit;
            }
        }
    }

    public int getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public int compareTo(Comparable comparableObject) {
        if (comparableObject instanceof Card){
            int result = rank.compareTo(((Card) comparableObject).getRank());
            if (result == 0){
                return suit.compareTo(((Card) comparableObject).getSuit());
            }
            return result;
        }
    }
}
