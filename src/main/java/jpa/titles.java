package jpa;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class titles {

	@Id
	private long emp_no;
	private String title;
	private Date from_date;
	private Date to_date;
	
	@ManyToOne
	@JoinColumn(name = "title", nullable = false,insertable=false, updatable=false)
	private employees tits;

	public titles() {
		super();
	}

	public titles(long emp_no, String title, Date from_date, Date to_date, employees tits) {
		super();
		this.title = title;
		this.from_date = from_date;
		this.to_date = to_date;
		this.tits = tits;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public employees getTits() {
		return tits;
	}

	public void setTits(employees tits) {
		this.tits = tits;
	}

	@Override
	public String toString() {
		return "titles [emp_no=" + ", title=" + title + ", from_date=" + from_date + ", to_date=" + to_date
				+ ", tits=" + tits + "]";
	}

	
	
	
}
