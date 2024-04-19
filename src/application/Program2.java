package application;

import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller INSERT ====");
		Department newDepartment = new Department(7, "HR");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted: New Id = " + newDepartment.getId());
		
		
		sc.close();

	}

}
