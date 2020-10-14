package Factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Dao.memberDao;
import Dao.porderDao;
import model.member;
import model.porder;

@Configuration
public class AppConfig2 {
	
	@Bean(name="md")
	public memberDao getMemberDao() {
		return new memberDao();
	}
	@Bean(name="pd")
	public porderDao getPorderDao() {
		return new porderDao();
		}
	@Bean(name="fd")
	public factDao getFactDao() {
		factDao fd=new factDao();
		fd.setMd(getMemberDao());
		fd.setPd(getPorderDao());
		return fd;
	}
}
