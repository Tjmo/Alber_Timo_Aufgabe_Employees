package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class salaries {

	@Id
	private int emp_no;
	private int birth_date;
	private Date from_date;
	private Date to_date;

	@ManyToOne
	@JoinColumn(name = "employee2", nullable = false)
	private employees employee2;

	public salaries() {
		super();
	}

	public salaries(int birth_date, Date from_date, Date to_date, employees salars) {
		super();
		this.birth_date = birth_date;
		this.from_date = from_date;
		this.to_date = to_date;
		this.employee2 = salars;
	}

	public int getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(int birth_date) {
		this.birth_date = birth_date;
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

	public employees getEmployee2() {
		return employee2;
	}

	public void setEmployee2(employees employee2) {
		this.employee2 = employee2;
	}

}
