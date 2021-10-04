package dao;

import jpa.employees;

public class EmployeesDao extends JpaDAO<employees>{

	
	public employees create(employees empl) {
		return super.create(empl);
	}
	public employees get(Object empID) {
		return super.find(employees.class, empID);		
	}
	public employees update(employees empl) {
		return super.update(empl);
	}
	public void delete(Object empID) {
		super.delete(employees.class, empID);
	}
	
	
}
