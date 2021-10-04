package dao;

import jpa.dept_emp;

public class Dept_empDao extends JpaDAO<dept_emp>{

	
	public dept_emp create(dept_emp dept_emps) {
		return super.create(dept_emps);
	}
	public dept_emp get(Object dept_empID) {
		return super.find(dept_emp.class, dept_empID);		
	}
	public dept_emp update(dept_emp dept_emps) {
		return super.update(dept_emps);
	}
	public void delete(Object dept_empID) {
		super.delete(dept_emp.class, dept_empID);
	}
	
	
}
