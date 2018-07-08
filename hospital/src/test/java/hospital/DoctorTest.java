package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("","","");
	Patient patient = new Patient();

	
	//test on state verification
	@Test
	public void shouldBeAbleToDrawBlood(){
		Patient patient = new Patient();
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore-bloodLevelAfter, is(5));

		
	}
		
	@Test
	public void shouldBeAbleToIncreasePatientHealthWithCare(){
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter-healthLevelBefore, is(5));
	}
}

