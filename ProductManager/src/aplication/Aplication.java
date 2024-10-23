package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Client client = new Client();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		client.setName(sc.nextLine());
		System.out.print("Email: ");
		client.setEmail(sc.nextLine());
		System.out.print("Birth date (DD/MM/YYYY): ");
		client.setBirthDate(sdf.parse(sc.next()));
		
		Order order = new Order();
		order.setStatus(OrderStatus.PROCESSING);
		System.out.println("Enter Order Data:");
		System.out.println("Status:" + order.getStatus().name());
		System.out.print("How many items to this order?: ");
		int requiredQuantity = sc.nextInt();
	
		sc.nextLine();
		OrderItem orderItem;
		
		for(int i = 0; i<requiredQuantity; i++) {
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			orderItem = new OrderItem(quantity,price,name);
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + sdfDate.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus().name());
		System.out.println("Client: " + client);
		System.out.println("Order items: ");
		if(order.items != null && !order.items.isEmpty()) {
			for(OrderItem x: order.items) {
				System.out.println(x);
			}
		}else {
			System.out.println("Lista de itens está vazia ou nula.");
		}
		System.out.println("Total Price: $" + order.total());
		sc.close();
	}

}
