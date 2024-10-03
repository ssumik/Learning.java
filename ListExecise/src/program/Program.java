package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee;
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			float salary = sc.nextFloat();
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			employee = new Employee(id, salary, name);
			list.add(employee);
		}
		System.out.printf("Enter the employee id that will receive a raise: ");
		int idSearch = sc.nextInt();
		Employee aux = (Employee) list.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);

		if (aux == null) {
			System.out.println("The id doesn't exist.");
		} else {
			System.out.print("Enter the percentage: ");
			float salaryIncrease = sc.nextFloat();
			aux.salaryIncrease(salaryIncrease);
		}
		sc.close();

		for (Employee x : list) {
			System.out.println(x);
		}
	}
}
