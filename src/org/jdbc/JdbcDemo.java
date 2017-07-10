package org.jdbc;

import org.jdbc.dao.JdbcDao;
import org.jdbc.dao.SimpleJdbcDao;
import org.jdbc.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		SimpleJdbcDao dao = ctx.getBean("simpleJdbcDao", SimpleJdbcDao.class);
		
		//Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		//dao.insertCircle(new Circle(5, "Fifth Circle"));
		/*System.out.println(dao.getCircleCount());
		System.out.println(dao.getCircleName(1));
		System.out.println(dao.getCircleforId(1).getName());
		System.out.println(dao.getAllCircles().size());
		dao.createTriangleTable();*/
		System.out.println(dao.getCircleCount());
		
	}

}
