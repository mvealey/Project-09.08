
public class FlipRace {

	public static void main(String[] args) {

		final int GOAL = 3;
		int count1 = 0, count2 = 0;
		Coin coin1 = new Coin(), coin2 = new Coin();
		
		coin1.setKey(123);
		coin2.setKey(456);
		
		coin1.lock(123);
		
		coin1.unLock(123);
		
		if (coin1.locked() || coin2.locked()) {
			System.out.println("Cannot proceed. One or more coins are locked.");
		}
		else {

			while (count1 < GOAL && count2 < GOAL) {
				coin1.flip();
				coin2.flip();
			
				System.out.println("Coin 1: " + coin1 + "\tCoin 2: " + coin2);
				
				//Increment or reset the counters
				count1 = (coin1.isHeads()) ? count1 + 1 : 0;
				count2 = (coin2.isHeads()) ? count2 + 1 : 0;
					
			}
			if (count2 < GOAL) {
				System.out.println("Coin 2 wins");
			}
			else {
				if (count2 < GOAL) {
					System.out.println("Coin 1 wins");
				}
				else {
					System.out.println("It's a tie.");
				}
			}
		}
	}
}
