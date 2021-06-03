package edu.evacodekitchen.employees;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSearch {

	public static long countNumberOfEmployeesWith(Title title, List<Employee> employees) {
		return employees.stream().filter(e -> e.getTitle().equals(title)).count();
	}

	public static double calculateAverageSalaryOf(Title title, List<Employee> employees) {
		return employees.stream().filter(e -> e.getTitle().equals(title)).mapToLong(e -> e.getSalary()).average()
				.getAsDouble();
	}

	public static List<Employee> findWithTitleAndSalaryGreaterThan(Long salary, Title title, List<Employee> employees) {
		return employees.stream().filter(e -> e.getTitle().equals(title)).filter(e -> e.getSalary() > salary)
				.collect(Collectors.toList());
	}

	public static Integer getNumberOfFemaleSoftwareDevelopers(List<Employee> employees) {
		return (int) employees.stream().filter(
				e -> e.getGender().equals(Gender.FELAME) && (e.getTitle().equals(Title.SENIOR_SOFTWARE_DEVELOPER)
						|| e.getTitle().equals(Title.JUNIOR_SOFTWARE_DEVELOPER)))
				.count();
	}

}