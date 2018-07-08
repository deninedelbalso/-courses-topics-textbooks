package org.wecancodeit.cleveland.hospital;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;

	public Nurse(String empNumber, String name, int numPatients) {
		this.empNumber = empNumber;
		this.name = name;
		this.numPatients = numPatients;

	}

	//dont need this anymore since its alreay in the parent class of employee 
	
//	public String getNumber() {
//		return empNumber;
//	}
//
//	public String getName() {
//		return name;
//	}

	public int getNumPatients() {
		return numPatients;
	}
	@Override
	public void careForPatient(Patient anyPatient) {
		anyPatient.receiveHealth(5);
	}

	public int calculatePay() {
		return 50000;
	}
	
	@Override
	public void drawBlood(Patient anyPatient) {
    anyPatient.giveBlood(5);		
	}

}


