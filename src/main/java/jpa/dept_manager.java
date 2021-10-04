package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.sql.Date;

@Entity
@Table
public class dept_manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dept_no;
	private long emp_no;
	private Date from_date;
	private Date to_date;
	
	@ManyToOne
	@JoinColumn(name = "manager", nullable = false)
	private Departments dept;
	@ManyToOne
	@JoinColumn(name = "employs", nullable = false)
	private employees employee;
	
	
	
	public dept_manager() {
		super();
	}



	public dept_manager(long dept_no, long emp_no, Date from_date, Date to_date, Departments dept,
			employees employee) {
		super();
		this.dept_no = dept_no;
		this.emp_no = emp_no;
		this.from_date = from_date;
		this.to_date = to_date;
		this.dept = dept;
		this.employee = employee;
	}



	public long getDept_no() {
		return dept_no;
	}



	public void setDept_no(long dept_no) {
		this.dept_no = dept_no;
	}



	public long getEmp_no() {
		return emp_no;
	}



	public void setEmp_no(long emp_no) {
		this.emp_no = emp_no;
	}



	public Date getFrom_date() {
		return from_date;
	}



	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}



	public Date getTo_date() {
		return to_date;
	}



	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}



	public Departments getDept() {
		return dept;
	}



	public void setDept(Departments dept) {
		this.dept = dept;
	}



	public employees getEmployee() {
		return employee;
	}



	public void setEmployee(employees employee) {
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "dept_manager [dept_no=" + dept_no + ", emp_no=" + emp_no + ", from_date=" + from_date + ", to_date="
				+ to_date + ", dept=" + dept + ", employee=" + employee + "]";
	}
	
	
	
	
}



