package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("=== TEST 2: seller findByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller lists : list) {
			System.out.println(lists);
		}

		System.out.println("=== TEST 3: seller findAll ====");
		list = sellerDao.findByDepartment(dep);
		for (Seller lists : list) {
			System.out.println(lists);
		}
		
		System.out.println("=== TEST 4: seller INSERT ====");
		Seller newSeller = new Seller(null, "GREG", "GREG@EMAIL", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Iserted! New id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller UPDATE ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Gomes");
		sellerDao.update(seller);
		System.out.println("Update completed ");
		
		System.out.println("=== TEST 6: seller DELETE ====");
		System.out.print("Enter id  for  delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complited ");
	}
}
