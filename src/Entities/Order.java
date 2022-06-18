package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Order {

	private Date moment = new Date();
	private OrderStatus status;

	private Client client;

	List<OrderItem> order = new ArrayList<>();

	public void orderAdd(OrderItem item) {
		order.add(item);
	}

	public void orderRemove(OrderItem item) {
		order.remove(item);
	}

	public double Total() {
		double sum = 0;
		for (OrderItem o : order) {
			sum += o.subTotal();
		}
		return sum;
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrder() {
		return order;
	}


}
