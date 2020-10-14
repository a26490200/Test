package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Factory.AppConfig2;
import Factory.factDao;
import model.porder;

public class porderDao implements impldao {

	public static void main(String[] args) {
		ApplicationContext a2=new AnnotationConfigApplicationContext(AppConfig2.class);
		factDao fd=a2.getBean(factDao.class);
		porder p=new porder();
		
		/*p.setName("n4");
		p.setP1(10);
		p.setP2(5);
		p.setP3(4);
		p.setP4(4);
		p.setSum(p.getSum());
		
		fd.getPd().add(p);*/ //新增測試ok
		
		porder p1=(porder)fd.getPd().query("n1");
		System.out.print("姓名:"+p1.getName()+
						"\nP1:"+p1.getP1()+
						"\nP2:"+p1.getP2()+
						"\nP3:"+p1.getP3()+
						"\nP4:"+p1.getP4()+
						"\n總價:"+p1.getSum());//查詢測試ok
		
		/*p.setId(1);
		p.setName("n1");
		p.setP1(1);
		p.setP2(5);
		p.setP3(4);
		p.setP4(4);
		p.setSum(p.getSum());
		
		fd.getPd().update(p);*/ //修改測試ok
		
		/*p.setId(4);
		
		fd.getPd().delete(p);*/ //刪除測試ok
		
		/*List<porder> l=new porderDao().porderQuery("n1");
		for(porder p1:l) {
			System.out.print("香蕉口味:"+p1.getP1());
			
			
		}*/
	}
	
	public List<porder>porderQuery(){
		
		Session se=impldao.getSe();
		String HQL="From porder";
		Query q=se.createQuery(HQL);
		List<porder> l=q.list();
		porder[] p=l.toArray(new porder[l.size()]);
		return l;
		
	}
	public List<porder>porderQuery(String name){
		
		Session se=impldao.getSe();
		String HQL="From porder where name='"+name+"'";
		Query q=se.createQuery(HQL);
		List<porder> l=q.list();
		porder[] p=l.toArray(new porder[l.size()]);
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
	public Object query(int id) {
		Session se=impldao.getSe();
		porder p=se.get(porder.class,id);
		return p;
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

	@Override
	public Object query(String name) {
		Session se=impldao.getSe();
		porder p=se.get(porder.class,name);
		return p;
	
	}

}
