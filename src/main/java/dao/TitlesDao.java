package dao;

import jpa.titles;

public class TitlesDao extends JpaDAO<titles>{

	
	public titles create(titles tity) {
		return super.create(tity);
	}
	public titles get(Object titleID) {
		return super.find(titles.class, titleID);		
	}
	public titles update(titles tity) {
		return super.update(tity);
	}
	public void delete(Object titleID) {
		super.delete(titles.class, titleID);
	}
	
	
}
