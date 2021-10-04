package jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Departments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dept_no;
	private String dept_name;
	
	@OneToMany
	@JoinColumn(name = "employee")
	private List<dept_emp> employees;
	@OneToMany
	@JoinColumn(name = "manager")
	private List<dept_manager> managers;
	
	
	public Departments() {
		super();
	}


	public Departments(long dept_no, String dept_name, List<dept_emp> employees, List<dept_manager> managers) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.employees = employees;
		this.managers = managers;
	}


	public long getDept_no() {
		return dept_no;
	}


	public void setDept_no(long dept_no) {
		this.dept_no = dept_no;
	}


	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}


	public List<dept_emp> getEmployees() {
		return employees;
	}


	public void setEmployees(List<dept_emp> employees) {
		this.employees = employees;
	}


	public List<dept_manager> getManagers() {
		return managers;
	}


	public void setManagers(List<dept_manager> managers) {
		this.managers = managers;
	}


	@Override
	public String toString() {
		return "Departments [dept_no=" + dept_no + ", dept_name=" + dept_name + ", employees=" + employees
				+ ", managers=" + managers + "]";
	}



	
	

	
}
