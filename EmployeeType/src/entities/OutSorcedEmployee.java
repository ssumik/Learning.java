package entities;

public class OutSorcedEmployee extends Employee{
	Double additionalCharge;
	
	public OutSorcedEmployee() {
		
	}

	public OutSorcedEmployee(String name, Double valuePerHour, Integer hours,Double addicionalCharge) {
		super(name, valuePerHour, hours);
		this.additionalCharge = addicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + super.getName() + ", valuePerHour=" + super.getValuePerHour() + ", hours=" + super.getWorkHour() + ""
				+
				", additional: " + this.additionalCharge+ "]";
	}
}
