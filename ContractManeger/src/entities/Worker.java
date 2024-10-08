package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Worker {
	private String name;
	private String level;
	private double baseSalary;
	private List<HourContract> list = new ArrayList<HourContract>();
	
	Scanner sc = new Scanner(System.in);
	private void addContract(HourContract contract){
		list.add(contract);
		contract = new HourContract();
		contract.setDate(new Date());
		contract.setHour(sc.nextInt());
		sc.nextLine();
		contract.setValuePerHour(sc.nextDouble());
	}
	private void removeContract(HourContract contract){
		list.remove(sc.nextInt());
		sc.nextLine();
	}
	private double income(Integer year, Integer month){
		//Stream<HourContract> dateIncome = list.stream().filter(date -> date.getDate())
		
		HourContract contract = null;
		for (HourContract hourContract : list) {
			HourContract contractDate = hourContract;
			if(contractDate.getDate().getMonth() == month && contractDate.getDate().getYear() == year) {
				contract = hourContract;
				break;
			}  
		}
		
		return 0;
	}
}
