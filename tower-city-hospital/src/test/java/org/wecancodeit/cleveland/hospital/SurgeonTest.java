package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {

	Surgeon anySurgeon = new Surgeon("4", "harry", "plastic", true);
	Patient anyPatient = new Patient();

	@Test
	public void shouldRenderProperSurgeonProperties(){
		String number = anySurgeon.getNumber();
		String name = anySurgeon.getName();
		String speciality = anySurgeon.getSpecialty();
		boolean isOperating = anySurgeon.isOperating();
		assertEquals("4", number);
		assertThat(name, is("harry"));
		assertTrue(isOperating);

	}

	@Test
	public void shouldIncreasePatientHealthFrom10To20() {
		anySurgeon.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(20, checkHealth);
	}

	@Test
	public void shouldLowerBloodLevelsFrom10To5() {
		anySurgeon.drawBlood(anyPatient);
		int checkBlood = anyPatient.getBloodLevels();
		assertEquals(5, checkBlood);
	}

	@Test
	public void shouldHaveSalaryof120000() {
		int salary = anySurgeon.calculatePay();
		assertEquals(120000, salary);
	}

}