package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docList = new ArrayList<Doctor>();
	ArrayList<Patient> PatientList = new ArrayList<Patient>();
	int i = 0;
	public void addDoctor(Doctor d) {
		docList.add(d);
		
	}

	public List<Doctor> getDoctors() {

		return docList;
	}

	public void addPatient(Patient patient) {
PatientList.add(patient);
	}

	public int getPatients() {

		return PatientList.size();
	}

	public void assignPatientsToDoctors() {
		for (Doctor docLists : docList) {
			for (Patient patient : PatientList) {
				try {
					docLists.assignPatient(patient);
				} catch (Exception e) {
					break;
				}
			}
		}
		
	}

}
