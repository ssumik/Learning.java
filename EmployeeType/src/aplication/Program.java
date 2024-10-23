package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSorcedEmployee;

public class Program {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees?: ");
		int quantity = sc.nextInt();

		String name;
		int hours;
		double valuePerHour;
		double additionalCharge;
		
		for (int i = 0; i < quantity; i++) {
			System.out.println("Employee data:");
			System.out.print("Outsorced? (y/n): ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			switch (option) {
			case 'y':
				System.out.print("Enter name: ");
				name = sc.nextLine();
				System.out.print("Enter value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Enter worked hours: ");
				hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter addtional charge: ");
				additionalCharge = sc.nextDouble();
				employees.add(new OutSorcedEmployee(name,valuePerHour,hours,additionalCharge));
				break;
			case 'n':
				System.out.print("Enter name: ");
				name = sc.nextLine();
				System.out.print("Enter value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Enter worked hours: ");
				hours = sc.nextInt();
				sc.nextLine();
				employees.add(new Employee(name,valuePerHour,hours));
				break;
			}
			
		}
		for(Employee x : employees) {
			System.out.println(x + " " + x.payment());
		}
		sc.close();
	}

}
