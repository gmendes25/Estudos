package exercicio;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import entitiesEnum.OrderStatus;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		String date = sc.next();
		Client client = new Client(name, email, date);
		System.out.println("Enter order data:");
		System.out.println("Status:");
		Order order = new Order(OrderStatus.valueOf(sc.next()), client);
		for (int i = 1; i <= 2; i++) {
			System.out.print("Product name: ");
			String pname = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price, new Product(pname, price));
			order.orderAdd(orderItem);
		}
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + DateFormat.getInstance().format(order.getMoment()));
		System.out.println("Client:" + client.getName() + " " + DateFormat.getDateInstance().format(client.getDate())
				+ " " + client.getEmail());
		System.out.println("Order Items:");
		
		for (OrderItem o : order.getOrder()) {
			System.out.println(o.getProduct().getPname() + ", $" + o.getPrice() + ", Quantity:" + o.getQuantity()
					+ ", Subtotal: $" + o.subTotal());

		}

		System.out.println("Total price: $" + order.Total());

		sc.close();
	}
}
