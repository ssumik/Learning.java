package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContracts> contracts = new ArrayList<>();

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addContract(HourContracts contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContracts contract) {
		contracts.remove(contract);
	}

	public double income(Integer month, Integer year) {
		double sum = baseSalary;

		for (HourContracts c : contracts) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH) + 1;
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}