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
public class dept_emp {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long emp_no;
		private long dept_no;
		
		private Date from_date;
		
		private Date to_date;
		
		@ManyToOne
		@JoinColumn(name = "employee", nullable = false)
		private Departments dept;
		@ManyToOne
		@JoinColumn(name = "empls", nullable = false)
		private employees employee;
		
		
		
		public dept_emp() {
			super();
		}



		public dept_emp(long emp_no, long dept_no, Date form_date, Date to_date, Departments dept,
				employees employee) {
			super();
			this.emp_no = emp_no;
			this.dept_no = dept_no;
			this.from_date = form_date;
			this.to_date = to_date;
			this.dept = dept;
			this.employee = employee;
		}



		public long getEmp_no() {
			return emp_no;
		}



		public void setEmp_no(long emp_no) {
			this.emp_no = emp_no;
		}



		public long getDept_no() {
			return dept_no;
		}



		public void setDept_no(long dept_no) {
			this.dept_no = dept_no;
		}



		public Date getForm_date() {
			return from_date;
		}



		public void setForm_date(Date form_date) {
			this.from_date = form_date;
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
			return "dept_emp [emp_no=" + emp_no + ", dept_no=" + dept_no + ", from_date=" + from_date + ", to_date="
					+ to_date + ", dept=" + dept + ", employee=" + employee + "]";
		}
		
	
	
	
}
