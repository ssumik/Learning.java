package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List<Person> list = new ArrayList<Person>();
	
	public void  storePerson(String name, int age, float height) {
		Person person = new Person(name, age, height);
		list.add(person);
	}
	
	public void  storePersonNoData() {
		Person person = new Person();
		list.add(person);
	}
	
	public void removePerson(String name) {
		for(Person person: list) {
			if(person.getName() == name) {
				list.remove(person);
				break;
			}
		}
	}
	
	public void removePersonIndex(int i) {
		list.remove(i);
	}
	
	public void printList() {
		System.out.println("list Data");
		for(Person person: list) {
			System.out.println("");
			person.personData();
		}
	}
	
	public void printListIndex(int i) {
		list.get(i).personData();
	}
	
}

