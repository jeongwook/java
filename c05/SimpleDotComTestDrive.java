import java.util.ArrayList;

public class SimpleDotComTestDrive {

	public static void main (String[] args) {

		SimpleDotCom dot = new SimpleDotCom();

		// set location
		ArrayList<String> locations = new ArrayList<String>() {
			{
				add("2");
				add("3");
				add("4");
			}
		};
		
		dot.setLocationCells(locations);

		String userGuess = "2";	// make a fake user guess

		String result = dot.checkYourself(userGuess);

		String testResult = "failed";

		if (result.equals("hit") ) {
			testResult = "passed";
		}

		System.out.println(testResult);
	}
}