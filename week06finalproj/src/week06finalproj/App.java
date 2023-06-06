package week06finalproj;

public class App {

	public static void main(String[] args) {
		// Automated WAR
		
		Deck playDeck = new Deck();
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		int cardsAtStake = 2;
		
		
		// WAR is played 26 times for two players with a total of 52 cards
		int hands = 26;
		
		playDeck.shuffle();

		// game logic
		for (int i = 1; i <=hands ; i++) {
			player1.setCurrentCard(playDeck.draw());
			player2.setCurrentCard(playDeck.draw());

			// Watch for deck being empty, this should not happen in 2 player WAR, but is there for safety or expanding
			if (player1.getCurrentCard() == null || player2.getCurrentCard() == null) {
				break;
			}
			
			ShowCards(player1, player2);
			
			// calculate winner of hand
			if (player1.getCurrentCard().getValue() > player2.getCurrentCard().getValue()) {
				player1.setScore(player1.getScore() + cardsAtStake);
				System.out.println(player1.getName() + " won this hand.");
				cardsAtStake = 2;
			} else if (player2.getCurrentCard().getValue() > player1.getCurrentCard().getValue()) {
				player2.setScore(player2.getScore() + cardsAtStake);
				System.out.println(player2.getName() + " won this hand.");
				cardsAtStake = 2;
			} else {
				// if a tie play another hand, the stakes go up by two cards
				System.out.println("WAR!");
				cardsAtStake += 2;
				i++;
			}
			
			System.out.println("-------------------------");
		}
		
		PrintFinalScore(player1, player2);
	}
	
	private static void ShowCards(Player player1, Player player2) {
		System.out.print(player1.getName() + "'s card: ");
		player1.getCurrentCard().describe();
		System.out.print(player2.getName() + "'s card: ");
		player2.getCurrentCard().describe();
	}

	
	private static void PrintFinalScore(Player player1, Player player2) {
		System.out.println(player1.getName() + " won " + player1.getScore() + " cards.");
		System.out.println(player2.getName() + " won " + player2.getScore() + " cards.");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!");
		} else {
			System.out.println("The game was a draw.");
		}
	}
}
