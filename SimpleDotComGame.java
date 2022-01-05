public class SimpleDotComGame {

public static void main(String[] args) {

	int numOfGuesses = 0; // keep track of player's guesses
	GameHelper helper = new GameHelper(); //gets user input
	
	SimpleDotCom theDotCom = new SimpleDotCom(); //makes dotcom object 
	int randomNum = (int) (Math.random() * 5); //make a random nuber for first cell
	
	int[] locations = {randomNum, randomNum + 1, randomNum + 2}; //populates array with random start location
	theDotCom.setLocationCells(locations);
	boolean isAlive = true; //ship hasn't been sunk

	while(isAlive == true) {
		String guess = helper.getUserInput("Enter a number");
		String result = theDotCom.checkYourself(guess);
		numOfGuesses++;
		if (result.equals("kill")) {
			isAlive = false;
			System.out.println("You took " + numOfGuesses + " guesses");
		}//end if
	} //end while
}// end main
}// end class