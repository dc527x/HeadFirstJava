public class SimpleDotComTestDrive {
	public static void main (String[] args) {

		SimpleDotCom dot = new SimpleDotCom(); // instantiate a SimpleDotCom object

		int[] locations = {2, 3, 4}; //make an int array for the location of the dot com (3 out of 7)
		dot.setLocationCells(locations); //invoke the setter method on the dot com

		String userGuess = "2"; //make a fake guess
		String result = dot.checkYourself(userGuess); //invoke check yourself method and pass it fake guess
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);

	}// end main
}// end class