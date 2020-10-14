package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.memberDao;
import model.member;

public class admindeletememberController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		
		member m=new member();
		m.setId(id);
		new memberDao().delete(m);
		return new ModelAndView("AD/member/admindeletemember.jsp");
	}

}
