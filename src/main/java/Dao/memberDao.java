package Dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Factory.AppConfig1;
import Factory.AppConfig2;
import Factory.factDao;
import Factory.factModel;
import model.member;

public class memberDao implements impldao {

	public static void main(String[] args) {
		ApplicationContext a2=new AnnotationConfigApplicationContext(AppConfig2.class);
		factDao fd=a2.getBean(factDao.class);
		
		/*member m=new member();
		m.setUser("u5");
		m.setPassword("1234");
		m.setName("n5");
		m.setBirthday(new Date("2020/07/27 22:12:50"));
		m.setPhone("p5");
		m.setEmail("e5");
		m.setAddress("a5");
		m.setType("t5");
		
		fd.getMd().add(m);*/ //新增測試ok
		
		member m=(member) fd.getMd().query("n1");
		System.out.print("帳號:"+m.getUser()+
				"\n密碼:"+m.getPassword()+
				"\n姓名:"+m.getName()+
				"\n生日:"+m.getBirthday()+
				"\n電話:"+m.getPhone()+
				"\n信箱:"+m.getEmail()+
				"\n地址:"+m.getAddress()+
				"\n權限:"+m.getType());//查詢測試ok
		
		/*member m=new member();
		m.setId(6);
		m.setPassword("1234");
		m.setName("nn6");
		m.setBirthday(new Date("2021/2/2"));
		m.setPhone("pp6");
		m.setEmail("ee6");
		m.setAddress("aa6");
		fd.getMd().update(m);*/ //修改測試ok
		
		/*member m=new member();
		m.setId(4);
		
		fd.getMd().delete(m);*/ //刪除測試ok
		

	}
	//登入帳號是否存在
	public List<member> memberlogin(String user,String password){
		Session se=impldao.getSe();
		String HQL="From member where user='"+user+"' and password='"+password+"'";
		Query q=se.createQuery(HQL);
		List<member> l=q.list();
		member [] m=l.toArray(new member[l.size()]);
		return l;
	}
	//檢查新增帳號是否重複
	public List<member> membercheck(String user){
		Session se=impldao.getSe();
		String HQL="From member where user='"+user+"'";
		Query q=se.createQuery(HQL);
		List<member> l=q.list();
		member[] m=l.toArray(new member[l.size()]);
		return l;
	}
	
	public List<member> memberQuery(){
		Session se=impldao.getSe();
		String HQL="From member";
		Query q=se.createQuery(HQL);
		List<member> l=q.list();
		member[] m=l.toArray(new member[l.size()]);
		return l;
			
	}
	

	@Override
	public void add(Object o) {
		Session se=impldao.getSe();
		Transaction tx=se.beginTransaction();
		se.save(o);
		tx.commit();
		
	}

	@Override
	public Object query(String name) {
		Session se=impldao.getSe();
		member m=se.get(member.class, name);
		return m;
	}
	public Object query(int id) {
		Session se=impldao.getSe();
		member m=se.get(member.class, id);
		return m;
	}

	@Override
	public void update(Object o) {
		Session se=impldao.getSe();
		Transaction tx=se.beginTransaction();
		se.update(o);
		tx.commit();
		
	}

	@Override
	public void delete(Object o) {
		Session se=impldao.getSe();
		Transaction tx=se.beginTransaction();
		se.delete(o);
		tx.commit();
		
	}

}
