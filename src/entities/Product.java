package entities;

public class Product {
	protected String name;
	protected Double price;

	public String priceTag() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(name + " $" + price);
		return sBuilder.toString();
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
}
