package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); 
		
		System.out.println("\n=== TEST 1: department insert ===");
		Department newDepartment = new Department(null, "Para Deletar");
		departmentDao.insert(newDepartment);
		
		
		System.out.println("\n=== TEST 2: department update ===");
		Department updateDepartment = new Department(9, "Deletar");
		departmentDao.update(updateDepartment);
		
		
		System.out.println("\n=== TEST 3: department delete ===");
		departmentDao.deleteById(9);

		System.out.println("\n=== TEST 4: department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> deps = departmentDao.findAll();
		System.out.println(deps);
		
	}

}
