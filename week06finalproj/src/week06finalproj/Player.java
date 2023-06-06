package week06finalproj;

import java.util.List;
import java.util.ArrayList;

public class Player {
	private int score;
	private Card currentCard;
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.setName(name);
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public Card getCurrentCard() {
		return currentCard;
	}
	public void setCurrentCard(Card currentCard) {
		this.currentCard = currentCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void flip() {
		setCurrentCard(hand.remove(0));
	}
	
	public void draw(Deck deck) {
		addCardToHand(deck.draw());
	}
	
	public void addCardToHand(Card card) {
		this.hand.add(card);
	}
	
	public void describe() {
		System.out.println(name + " : hand\n");
		
		
		for (Card card : hand) {
			card.describe();
		}
		
		System.out.println("-------------------------");
	}
}
