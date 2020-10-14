package Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.memberDao;
import model.member;

public class addmemberController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String user=request.getParameter("user");
		
		List l=new memberDao().membercheck(user);
		if(l.size()!=0) {
			return new ModelAndView("M/member/addmemberError.jsp");
		}
		else {
			member m=new member();
			m.setUser(request.getParameter("user"));
			m.setPassword(request.getParameter("password"));
			m.setName(request.getParameter("name"));
			m.setBirthday(new Date(request.getParameter("birthday")));
			m.setPhone(request.getParameter("phone"));
			m.setEmail(request.getParameter("email"));
			m.setAddress(request.getParameter("address"));
			m.setType(request.getParameter("type"));
			
			new memberDao().add(m);
			
			return new ModelAndView("M/member/addmemberok.jsp");
			
		}
		
	}

}
