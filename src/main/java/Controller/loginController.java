package Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.memberDao;
import model.member;

public class loginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		
		List l=new memberDao().memberlogin(user, password);
		if(l.size()!=0) {
			Object[]o=l.toArray();
			member m=(member) o[0];
			HttpSession session= request.getSession();
			session.setAttribute("M", m);
			if(m.getType().equals("member")) {
				return new ModelAndView("memberOrporder.jsp");
			}
			else {
				return new ModelAndView("AD/admin.jsp");
			}
		}
		
		return new ModelAndView("loginError.jsp");
	}

}
