package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Worker {
	private Department department;
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private List<HourContract> list = new ArrayList<HourContract>();
	
	Scanner sc = new Scanner(System.in);
	public void addContract(){
		HourContract contract;
		contract = new HourContract();
		contract.setDate(new Date());
		System.out.print("Enter the amount of hour of this contract: ");
		contract.setHour(sc.nextInt());
		sc.nextLine();
		System.out.print("Set the value per hour of this contract: ");
		contract.setValuePerHour(sc.nextDouble());
		list.add(contract);
	}
	
	public void removeContract(HourContract contract){
		list.remove(sc.nextInt());
		sc.nextLine();
	}
	
	public double income(Integer year, Integer month){
		//Stream<HourContract> dateIncome = list.stream().filter(date -> date.getDate())
		HourContract contract = null;
		for (HourContract hourContract : list) {
			HourContract contractDate = hourContract;
			if(contractDate.getDate().getMonth() == month && contractDate.getDate().getYear() == year) {
				contract = hourContract;
				break;
			}
		}
		return contract.totalValue() + baseSalary;
	}

	public Worker(Department department, String name, WorkerLevel level, double baseSalary) {
		this.department = department;
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	
	
}