package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	ArrayList<Patient> PatientList = new ArrayList<Patient>();
	public void addDoctor(Doctor d) {
		docList.add(d);
		
	}

	public int getDoctors() {

		return docList.size();
	}

	public void addPatient(Patient patient) {
PatientList.add(patient);
	}

	public int getPatients() {

		return PatientList.size();
	}

}
