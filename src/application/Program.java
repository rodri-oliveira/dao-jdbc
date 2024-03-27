package application;


import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "Rodrigo", "bob@", new Date(), 3000.0, obj);
		System.out.println(obj);
		System.out.println(seller);

	}

}
