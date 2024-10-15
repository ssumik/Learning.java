package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContracts;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(department));

		System.out.print("How many contracts will be added to this worker?: ");
		int contractNum = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < contractNum; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data: ");
			System.out.print("Date(dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.nextLine());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			sc.nextLine();

			HourContracts contract = new HourContracts(contractDate, valuePerHour, duration);
			worker.addContract(contract);
		}

		System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.printf("Name: %s\nDepartment: %s\n", worker.getName(), worker.getDepartment().getName());
		System.out.println("Total income for " + monthAndYear + ": " + worker.income(month,year));
		
		sc.close();
	}

}
