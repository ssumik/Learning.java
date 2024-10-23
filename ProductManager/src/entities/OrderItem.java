package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	public Product product;

	public OrderItem(Integer quantity, Double price,String name) {
		this.quantity = quantity;
		this.price = price;
		this.product = new Product(name, price);
	}

	public Double subTotal() {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = product.getPrice();
	}

	public String toString() {
		return product.getName() + ", " + price + ", Quantity: " + quantity + ", Subtotal: " + subTotal();
	}

}
