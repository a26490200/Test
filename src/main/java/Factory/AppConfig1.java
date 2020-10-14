package Factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.member;
import model.porder;
@Configuration
public class AppConfig1 {
	@Bean(name="m")
	public member getMember() {
		return new member();
	}
	@Bean(name="p")
	public porder getPorder() {
		return new porder();
	}
	@Bean(name="fm")
	public factModel getFactModel() {
		factModel fm=new factModel();
		fm.setM(getMember());
		fm.setP(getPorder());
		
		return fm;
	}
}
