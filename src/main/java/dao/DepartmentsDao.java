package dao;

import jpa.Departments;

public class DepartmentsDao extends JpaDAO<Departments>{

	
	public Departments create(Departments departmenty) {
		return super.create(departmenty);
	}
	public Departments get(Object departmentID) {
		return super.find(Departments.class, departmentID);		
	}
	public Departments update(Departments departmenty) {
		return super.update(departmenty);
	}
	public void delete(Object departmentID) {
		super.delete(Departments.class, departmentID);
	}
	
	
}
