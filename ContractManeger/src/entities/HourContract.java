package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private Integer hour;
	
	public double totalValue() {
		return valuePerHour * (double)hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public HourContract(Date date, double valuePerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}
	public HourContract() {
		
	}
	
	
}
