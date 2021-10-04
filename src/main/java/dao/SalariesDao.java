package dao;

import jpa.salaries;

public class SalariesDao extends JpaDAO<salaries>{

	
	public salaries create(salaries salary) {
		return super.create(salary);
	}
	public salaries get(Object salaryID) {
		return super.find(salaries.class, salaryID);		
	}
	public salaries update(salaries salary) {
		return super.update(salary);
	}
	public void delete(Object salaryID) {
		super.delete(salaries.class, salaryID);
	}
	
	
}
