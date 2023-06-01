package week06finalproj;

public class Player {
	private int score;
	private Card currentCard;
	private String name;
	
	public Player(String name) {
		this.setName(name);
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
	
}
