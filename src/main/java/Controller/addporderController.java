package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.porderDao;
import model.member;
import model.porder;

public class addporderController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session=request.getSession();
		porder p=(porder) session.getAttribute("P");
		
		new porderDao().add(p);
		
		return new ModelAndView("M/porder/addporderok.jsp");
	}

}
