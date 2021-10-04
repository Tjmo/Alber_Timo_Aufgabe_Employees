package dao;

import jpa.dept_manager;

public class Dept_mangerDao extends JpaDAO<dept_manager>{

	
	public dept_manager create(dept_manager dept_managy) {
		return super.create(dept_managy);
	}
	public dept_manager get(Object dept_managID) {
		return super.find(dept_manager.class, dept_managID);		
	}
	public dept_manager update(dept_manager dept_managy) {
		return super.update(dept_managy);
	}
	public void delete(Object dept_managID) {
		super.delete(dept_manager.class, dept_managID);
	}
	
	
}
