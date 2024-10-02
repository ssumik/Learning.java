package entities;

import java.util.Scanner;

public class Elevator {
	private int capacity;
	private int currentPeopleIn;
	private int currentFloor;
	private int highestFloor;
	Scanner sc = new Scanner(System.in);
	Agenda agenda = new Agenda();
	
	public void inicialize(int capacity, int highestFloor){
		Elevator elevator = new Elevator();
		elevator.capacity = capacity;
		elevator.highestFloor = highestFloor;
	}
	
	public void enter() {
		if(currentPeopleIn < capacity && currentPeopleIn > -1) {
			currentPeopleIn++;
			agenda.storePersonNoData();
		}else if(currentPeopleIn == capacity){
			System.out.println("all Elevator capacity have been achived.");
		}
	}
	
	public void exit() {
		if (currentPeopleIn > 0) {
			int i = sc.nextInt();
			agenda.removePersonIndex(i);
			currentPeopleIn--;
		}else if(currentPeopleIn == capacity){
			System.out.println("Elevator is empty.");
		}
	}
	
	public void floorDown() {
		if (currentFloor < highestFloor && currentFloor > -1) {
			currentFloor++;
		}else{
			System.out.println("Can't reach this floor.");
		}
	}
}
