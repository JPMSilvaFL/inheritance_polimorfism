package entities;

import java.time.LocalDate;

public final class UsedProduct extends Product {
	protected LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public final String priceTag() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(name + " $" + price + " (Manufacture Date: " + manufactureDate + ")");
		return sBuilder.toString();
	}
}
