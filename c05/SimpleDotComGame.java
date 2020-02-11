import java.util.ArrayList;

public class SimpleDotComGame {

	public static void main(String[] args) {

		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();

		int randomNum = (int) (Math.random() * 5);

		// set location
		ArrayList<String> locations = new ArrayList<String>() {
			{
				add(Integer.toString(randomNum));
				add(Integer.toString(randomNum + 1));
				add(Integer.toString(randomNum + 2));
			}
		};

		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;

			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}

}