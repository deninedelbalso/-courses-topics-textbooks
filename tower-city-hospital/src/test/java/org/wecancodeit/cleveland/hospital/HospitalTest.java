package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	// makes them global so we can refer to them in all the tests
	Hospital myHospital;
	Patient alan;
	Doctor phil;
	Janitor rosie;

	@Before
	public void setUp() {
		myHospital = new Hospital();
		alan = new Patient();
		phil = new Doctor("1", "phil", "brain");
		rosie = new Janitor("2", "rosie", true);
	}

	@Test
	public void hospitalShouldBeAbleToHireAnEmployee() {
		myHospital.hire(rosie);
		Employee foundJanitor = myHospital.findEmployee(rosie.getNumber());
		// or you can do myHospital.findEmployee("2");
		assertThat(foundJanitor, is(rosie));

	}

	@Test
	public void hospitalShouldBeAbleToHireTwoEmployees() {
		myHospital.hire(rosie);
		myHospital.hire(phil);
		Employee foundJanitor = myHospital.findEmployee(rosie.getNumber());
		Employee foundDoctor = myHospital.findEmployee(phil.getNumber());
		// or you can do myHospital.findEmployee("2");
		assertThat(foundJanitor, is(rosie));
		assertThat(foundDoctor, is(phil));

	}

	@Test
	public void hospitalShouldFireACollectionofEmployees() {
		myHospital.hire(rosie);
		myHospital.hire(phil);
		myHospital.fire(phil);
		Collection<Employee> hiredEmployees = myHospital.getAllEmployees();
		assertThat(hiredEmployees, containsInAnyOrder(rosie));
		assertThat(hiredEmployees.size(), is(1));
	}
}