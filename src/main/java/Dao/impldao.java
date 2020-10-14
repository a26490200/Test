package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Factory.AppConfig1;
import Factory.AppConfig2;

public interface impldao {

	//連線
	public static Session getSe() {
		Configuration conn=new Configuration().configure();
		SessionFactory sf=conn.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}
	
	ApplicationContext a1=new AnnotationConfigApplicationContext(AppConfig1.class);
	ApplicationContext a2=new AnnotationConfigApplicationContext(AppConfig2.class);
	//新增
	void add(Object o);
	//查詢
	Object query(int id);
	Object query(String name);
	//修改
	void update(Object o);
	//刪除
	void delete(Object o);
	
}
