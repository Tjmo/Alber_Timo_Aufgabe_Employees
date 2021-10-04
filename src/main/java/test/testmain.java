package test;

import dao.SalariesDao;
import jpa.salaries;

public class testmain {

	public static void main(String[] args) {
		SalariesDao S = new SalariesDao();
		salaries A = S.get(10001);
		System.out.println(A);
	}

}
