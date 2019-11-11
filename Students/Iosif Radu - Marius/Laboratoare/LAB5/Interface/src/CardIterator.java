public class CardIterator {
    private Card[] cardArray;
    int current = 0;

    public cardIterator(){
        this.cardArray = new Card[13];
    }

    @Override
    public boolean hasNext() {
        if (current < cardArray.length) {
            return true;
        } else {
            return false;
        }
    }



}
