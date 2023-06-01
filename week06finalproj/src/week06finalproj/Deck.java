package week06finalproj;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		setUpDeck();
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		setUpDeck();
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			System.out.println("Out of cards.");
			return null;
		}		
	}
	
	private void setUpDeck() {
		cards.removeAll(cards);
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		int [] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				cards.add(new Card(names[i],suit,values[i]));
			}
		}
	}
}
