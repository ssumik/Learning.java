package entities;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String email;
	private Person[] room = new Person[10];
	
	public Person() {
	}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void rentRoom() {
		System.out.print("How many rooms will be sold?: ");
		int quantity = sc.nextInt();

		if (quantity >= 1 && quantity <= 10) {
			for (int i = 0; i < quantity; i++) {
				System.out.printf("Rent #%d%n", i + 1);

				sc.nextLine();
				
				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Email: ");
				String email = sc.nextLine();

				System.out.print("Room: ");
				int roomNum = sc.nextInt();
				if (room[roomNum] != null) {
	                    System.out.println("Room occupied!");
	                } else {
	                    room[roomNum] = new Person(name,email);
	                }
	            }
			}
			
			sc.close();
		}
	
		public void printRoomData() {
			System.out.println("Busy rooms:");
			for(int i = 0; i<10; i++) {
				if (room[i] != null){
					System.out.printf("%d: %s, %s%n", i, room[i].name, room[i].email);
				}
			}
		}
	}
