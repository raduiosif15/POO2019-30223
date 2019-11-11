import java.util.NoSuchElementException;

public abstract class CardIterator implements OrderIterator {
    private Card[] cardArray;
    int current = 0;

    public CardIterator(){
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

    @Override
    public Card next(){
        if (hasNext()){
            return cardArray[current++];
        } else {
            throw new NoSuchElementException();
        }
    }

    private Card[] removeCard(int index){
        int newDeckLength = cardArray.length - 1;
        Card[] newCardDeck = new Card[newDeckLength];
        int newDeckCurrent = 0;

        for (int i = 0; i <= newDeckLength; i++){
            if (i != index)
                newCardDeck[newDeckCurrent] = cardArray[i];
            newDeckCurrent++;
        }

        return newCardDeck;
    }

    @Override
    public void remove(){
        this.cardArray = removeCard(current - 1);
    }

    private Card[] insertCards(Comparable comparableItem) {
        Card[] newCardDeck = new Card[cardArray.length + 1];

        int cardIndex = 0;
        boolean insertedItem = false;
        for (int i = 0; i < newCardDeck.length; i++) {
            if ((cardIndex == cardArray.length || ((Card) comparableItem).compareTo(cardArray[cardIndex]) < 0) && !insertedItem) {
                newCardDeck[i] = ((Card) comparableItem);
                insertedItem = true;
            } else {
                newCardDeck[i] = cardArray[cardIndex];
                cardIndex++;
            }
        }

        return newCardDeck;
    }

    @Override
    public void put(Comparable comparableItem){
        this.cardArray = insertCards(comparableItem);
    }
}
