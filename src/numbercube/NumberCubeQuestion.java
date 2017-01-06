package numbercube;

public class NumberCubeQuestion {

	public static Object getLongestRun(int[] testValues) {
int longestRun = 0;
int startOfStreak= 0;
int temp = 0;
int temp1 = 0;
for (int i = 0; i < testValues.length; i++) {
	temp = testValues[i];
	if (temp == temp1) {
		longestRun++;
		startOfStreak = i;
	}
	else {
		longestRun = 0;
		startOfStreak=0;
	}
	temp1 = temp;
	
}
		return startOfStreak;
	}

	public static int[] getCubeTosses(NumberCube numberCube, int numOfTosses) {
		for (int i = 0; i < numOfTosses; i++) {
			numberCube.toss();
		}
		return numberCube.getValues();
	}

}
