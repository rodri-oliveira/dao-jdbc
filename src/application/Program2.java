package application;

import java.util.List;
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
		
		System.out.println("=== TEST 1: department findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("=== TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		/*System.out.println("=== TEST 3: department INSERT ====");
		Department newDepartment = new Department(6, "PPL");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted: New Id = " + newDepartment.getId());
		*/
		
		System.out.println("=== TEST 4: department UPDATE ====");
		department = departmentDao.findById(5);
		department.setName("TESTE");
		departmentDao.update(department);
		System.out.println("Update completed. ");
		
		System.out.println("=== TEST 5: department DELETE ====");
		System.out.print("Enter with id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complited. ");
		
		
		
		
		
		
		sc.close();

	}

}
