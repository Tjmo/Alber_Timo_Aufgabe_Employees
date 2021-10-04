package jpa;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;









@Entity
@Table
public class employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_no;
	
	private Date birth_date;
	private String first_name;
	private String last_name;
	private String gender;
	
	private Date hire_date;
	
	@OneToMany
	@JoinColumn(name = "employee")	
	private List<dept_emp> employees;
	@OneToMany
	@JoinColumn(name = "manager")
	private List<dept_manager> managers;
	@OneToMany
	@JoinColumn(name = "employee2")
	private List<salaries> salars;
	@OneToMany
	@JoinColumn(name = "title",insertable=false, updatable=false)
	private List<titles> tits;
	
	
	
	public employees() {
		super();
	}



	public employees(long emp_no, Date birth_date, String first_name, String last_name, String gender,
			Date hire_date, List<dept_emp> employees, List<dept_manager> managers, List<salaries> salars,
			List<titles> tits) {
		super();
		this.emp_no = emp_no;
		this.birth_date = birth_date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hire_date = hire_date;
		this.employees = employees;
		this.managers = managers;
		this.salars = salars;
		this.tits = tits;
	}



	public long getEmp_no() {
		return emp_no;
	}



	public void setEmp_no(long emp_no) {
		this.emp_no = emp_no;
	}



	public Date getBirth_date() {
		return birth_date;
	}



	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getHire_date() {
		return hire_date;
	}



	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
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



	public List<salaries> getSalars() {
		return salars;
	}



	public void setSalars(List<salaries> salars) {
		this.salars = salars;
	}



	public List<titles> getTits() {
		return tits;
	}



	public void setTits(List<titles> tits) {
		this.tits = tits;
	}



	@Override
	public String toString() {
		return "employees [emp_no=" + emp_no + ", birth_date=" + birth_date + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", hire_date=" + hire_date + ", employees="
				+ employees + ", managers=" + managers + ", salars=" + salars + ", tits=" + tits + "]";
	}
	
	
	
	
	
	
}
