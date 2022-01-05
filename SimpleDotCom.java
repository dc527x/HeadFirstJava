public class SimpleDotCom {
	int[] locationCells; //array of cells
	int numOfHits = 0;

	public void setLocationCells(int[] locs) { //creates the locations
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess); //reads integer guess from user
		String result = "miss"; // result of users guess
		for (int cell : locationCells) { //iterate through location cells array
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}			
		}//end loop 
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}//end method
}//end class