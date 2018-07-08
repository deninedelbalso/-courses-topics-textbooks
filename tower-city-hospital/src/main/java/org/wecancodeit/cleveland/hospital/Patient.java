package org.wecancodeit.cleveland.hospital;

public class Patient {

	private int healthLevel = 10;
	private int bloodLevel = 10;

	public int getHealth() {
		return healthLevel;
	}

	// default constructor
	public Patient() {
		healthLevel = 10;
		bloodLevel = 10;

	}

	// overloaded constructor
	public Patient(int healthLevel, int bloodLevel) {
		this.healthLevel = healthLevel;
		this.bloodLevel = bloodLevel;
	}

	public void receiveHealth(int amount) {
		healthLevel += amount;
	}

	public void lowerBlood(int amount) {
		bloodLevel -= amount;
	}

	public int getBloodLevels() {
		return bloodLevel;
	}

	public void giveBlood(int amount) {
		bloodLevel -= amount;
	}

}
