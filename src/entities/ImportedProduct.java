package entities;

public final class ImportedProduct extends Product {
	protected Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		Double totalPrice = price + customsFee;
		return totalPrice;
	}

	@Override
	public final String priceTag() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(name + " $" + totalPrice() + " (Customs fee: $ " + customsFee + ")");
		return sBuilder.toString();
	}
}
