package Controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Factory.AppConfig1;
import Factory.AppConfig2;
import Factory.factDao;
import Factory.factModel;

public class test {

	public static void main(String[] args) {
		
		/*Configuration conn=new Configuration().configure();
		SessionFactory sf=conn.buildSessionFactory();
		Session se=sf.openSession();
		System.out.print(se);*/
		
		ApplicationContext a1=new AnnotationConfigApplicationContext(AppConfig1.class);
		factModel fm=a1.getBean(factModel.class);
		fm.getM().setUser("u1");
		fm.getM().setPassword("1234");
		fm.getM().setName("n1");
		fm.getM().setBirthday(new Date("2020/07/27 22:12:50"));
		fm.getM().setPhone("p1");
		fm.getM().setEmail("e1");
		fm.getM().setAddress("a1");
		fm.getM().setType("t1");
		System.out.print("帳號:"+fm.getM().getUser()+
						"\n密碼:"+fm.getM().getPassword()+
						"\n姓名:"+fm.getM().getName()+
						"\n生日:"+fm.getM().getBirthday()+
						"\n電話:"+fm.getM().getPhone()+
						"\n信箱:"+fm.getM().getEmail()+
						"\n地址:"+fm.getM().getAddress()+
						"\n權限:"+fm.getM().getType());
		
		
		ApplicationContext a2=new AnnotationConfigApplicationContext(AppConfig2.class);
		factDao fd=a2.getBean(factDao.class);
		
		//System.out.println(fd.getMd());
		//System.out.println(fd.getPd());

	}

}
