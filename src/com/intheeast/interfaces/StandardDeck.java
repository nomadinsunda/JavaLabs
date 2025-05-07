package com.intheeast.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck {
    
    private List<Card> entireDeck;
    
    // ...
    
    public void sort() {
        Collections.sort(entireDeck);
    }

	@Override
	public List<Card> getCards() {
		return entireDeck;
	}

	@Override
	public Deck deckFactory() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return entireDeck.size();
	}

	@Override
	public void addCard(Card card) {
		entireDeck.add(card);
		
	}

	@Override
	public void addCards(List<Card> cards) {
		for(Card card : cards) {
			entireDeck.add(card);
		}		
	}

	@Override
	public void addDeck(Deck deck) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(Comparator<Card> c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deckToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
}