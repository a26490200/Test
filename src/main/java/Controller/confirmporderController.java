package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.porderDao;
import model.member;
import model.porder;

public class confirmporderController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int p1=Integer.parseInt(request.getParameter("p1"));
		int p2=Integer.parseInt(request.getParameter("p2"));
		int p3=Integer.parseInt(request.getParameter("p3"));
		int p4=Integer.parseInt(request.getParameter("p4"));
		
		HttpSession session=request.getSession();
		member m=(member) session.getAttribute("M");
		porder p=new porder();
		p.setName(m.getName());
		p.setP1(p1);
		p.setP2(p2);
		p.setP3(p3);
		p.setP4(p4);
		p.setSum(p.getSum());
		
		session.setAttribute("P", p);
		
		return new ModelAndView("M/porder/confirmporder.jsp");
	}

}
