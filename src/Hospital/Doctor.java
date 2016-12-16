package Hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	Boolean tof = false;
	int i = 0;

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

	public void assignPatient(Patient patient) throws DoctorFullExeption {
		
		if (patients.size() < 3 ) {
			patients.add(patient);

		}
		else {
			throw new DoctorFullExeption();
		}
	}

	public ArrayList<Patient> getPatients() {

		return patients;
	}

	public void doMedicine() {
		tof = true;
		for (Patient patient : patients) {
			patients.get(i).checkPulse();
			i++;
		}
	}

}
