package Hospital;

import java.util.ArrayList;

public class Doctor {

	public boolean performsSurgery() {
		if (this instanceof Surgeon) {
			return true;
		}
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

}
