package Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.memberDao;
import model.member;

public class updatememberController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		
		member m=new member();
		m.setId(id);
		m.setUser(request.getParameter("user"));
		m.setPassword(request.getParameter("password"));
		m.setName(request.getParameter("name"));
		m.setBirthday(new Date(request.getParameter("birthday")));
		m.setPhone(request.getParameter("phone"));
		m.setEmail(request.getParameter("email"));
		m.setAddress(request.getParameter("address"));
		m.setType(request.getParameter("type"));
		
		new memberDao().update(m);
		return new ModelAndView("M/member/querymember.jsp");
		
		
	}

}
