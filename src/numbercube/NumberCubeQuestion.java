package numbercube;

public class NumberCubeQuestion {

	public static int getLongestRun(int[] testValues) {
		int curentRunLength = 0;
		int highestRunLength = 0;
		int finalIndex = 0;
		int number;
		int PreviousNumber = 0;
		for (int i = 0; i < testValues.length; i++) {
			number = testValues[i];
			System.out.println(testValues[i]);
			if (number == PreviousNumber) {
				curentRunLength++;
			}
			if (number != PreviousNumber) {
				if (curentRunLength>highestRunLength) {
					highestRunLength = curentRunLength;
					finalIndex = i -curentRunLength -1;
					//System.out.println(curentRunLength);
					curentRunLength = 0;
								}
			}
			
			
			
			//System.out.println("First number "+ number);
			//System.out.println("Second number " + PreviousNumber);
			PreviousNumber = number;
		}
		//System.out.println("Final index " +finalIndex);
		return finalIndex;
	}

	public static int[] getCubeTosses(NumberCube numberCube, int numOfTosses) {
		for (int i = 0; i < numOfTosses; i++) {
			numberCube.toss();
		}
		return numberCube.getValues();
	}

}
