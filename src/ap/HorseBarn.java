package ap;

public class HorseBarn {
	Horse[] spaces;

	public Horse[] getSpaces() {

		return spaces;
	}

	public void setSpaces(Horse[] spaces) {
		this.spaces = spaces;
	}

	public static HorseBarn createTestBarn() {
		HorseBarn horseBarn = new HorseBarn();
		// 5. initialize spaces as in AP exam page 14
		Horse[] space = { new Horse("Trigger", 1340), null, new Horse("Silver", 1210), new Horse("Lady", 1575), null, new Horse("Patches", 1350), new Horse("Duke", 1410) };
		// 5.5 set the spaces array in the horseBarn object
		horseBarn.setSpaces(space);
		return horseBarn;
	}

	public int findHorseSpace(String string) {
		int j = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				if (spaces[i].getName() == string) {
					j = i;
					break;
				}
				if (spaces[i].getName() != string) {
					j = -1;
				}
			}
		}
		return j;
	}

	public void consolidate() {
		int index = 0;
		Horse[] spaces1 = new Horse[7];
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				spaces1[index] = spaces[i];
				
				index++;
			}
		}
		spaces = spaces1;
	}

}
