package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c,u,i): ");
			char pString = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (pString == 'c') {
				products.add(new Product(name, price));
			} else if (pString == 'u') {
				System.out.print("Manufactured Date (DD/MM/YYYY) : ");
				LocalDate manufacturedDate = LocalDate.parse(sc.next(), fmt1);
				products.add(new UsedProduct(name, price, manufacturedDate));
			} else if (pString == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.println("Enter valid data !!!");
				i--;
			}
		}
		System.out.println("Price Tags: ");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}
