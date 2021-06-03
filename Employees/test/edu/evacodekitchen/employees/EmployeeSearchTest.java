package edu.evacodekitchen.employees;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeSearchTest {

	private static List<Employee> employees;

	@BeforeAll
	static void beforeAll() {
		// given
		Employee lineManager1 = new Employee("Lily", "King", Gender.FELAME, Title.LINE_MANAGER, 1200L, null);
		Employee lineManager2 = new Employee("Johnny", "Jones", Gender.MALE, Title.LINE_MANAGER, 1000L, lineManager1);
		Employee lineManager3 = new Employee("Peter", "Brown", Gender.MALE, Title.LINE_MANAGER, 1300L, lineManager1);

		Employee employee1 = new Employee("Sarah", "Miller", Gender.MALE, Title.SENIOR_SOFTWARE_DEVELOPER, 200L,
				lineManager2);
		Employee employee2 = new Employee("David", "Lee", Gender.MALE, Title.JUNIOR_SOFTWARE_DEVELOPER, 150L,
				lineManager2);
		Employee employee3 = new Employee("Markus", "Thomas", Gender.MALE, Title.JUNIOR_SOFTWARE_DEVELOPER, 160L,
				lineManager2);
		Employee employee4 = new Employee("Eva", "Perez", Gender.FELAME, Title.JUNIOR_SOFTWARE_DEVELOPER, 110L,
				lineManager2);
		Employee employee5 = new Employee("Liza", "Martin", Gender.FELAME, Title.SENIOR_SOFTWARE_DEVELOPER, 240L,
				lineManager2);

		employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(lineManager1);
		employees.add(lineManager2);
		employees.add(lineManager3);
	}

	@Test
	void numberOfEmployeesWithGiveTitleShouldBeReturned() {
		// when
		long nrOfSeniorSoftwareDevelopers = EmployeeSearch.countNumberOfEmployeesWith(Title.SENIOR_SOFTWARE_DEVELOPER,
				employees);

		// then
		Assertions.assertEquals(2, nrOfSeniorSoftwareDevelopers);
	}

	@Test
	void averageSalaryOfEmployeesWithGivenTitleShouldBeReturned() {
		// when
		double averageSalary = EmployeeSearch.calculateAverageSalaryOf(Title.JUNIOR_SOFTWARE_DEVELOPER, employees);

		// then
		Assertions.assertEquals(140f, averageSalary);
	}

	@Test
	void employeesWithGivenTitleAndSalaryGreaterThanAGivenValueShouldBeReturned() {
		// when
		List<Employee> lineManagersWithSalaryGreaterThen1100ShouldBeReturned = EmployeeSearch
				.findWithTitleAndSalaryGreaterThan(1100L, Title.LINE_MANAGER, employees);

		// then
		Assertions.assertEquals(2, lineManagersWithSalaryGreaterThen1100ShouldBeReturned.size());
		Employee employee1 = lineManagersWithSalaryGreaterThen1100ShouldBeReturned.get(0);
		Assertions.assertEquals("Lily", employee1.getFirstName());
		Employee employee2 = lineManagersWithSalaryGreaterThen1100ShouldBeReturned.get(1);
		Assertions.assertEquals("Peter", employee2.getFirstName());
	}

	@Test
	void numberOfFemaleSoftwareDevelopersShouldBeReturned() {
		// when
		Integer numberOfFemaleSoftwareDevelopers = EmployeeSearch.getNumberOfFemaleSoftwareDevelopers(employees);

		// then
		Assertions.assertEquals(2, numberOfFemaleSoftwareDevelopers);
	}

}
