package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.porderDao;
import model.porder;

public class adminupdateporderController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		int p1=Integer.parseInt(request.getParameter("p1"));
		int p2=Integer.parseInt(request.getParameter("p2"));
		int p3=Integer.parseInt(request.getParameter("p3"));
		int p4=Integer.parseInt(request.getParameter("p4"));
		porder p=new porder();
		p.setName(request.getParameter("name"));
		p.setId(id);
		p.setP1(p1);
		p.setP2(p2);
		p.setP3(p3);
		p.setP4(p4);
		p.setSum(p.getSum());
		
		new porderDao().update(p);
		
		return new ModelAndView("AD/porder/adminupdateporder.jsp");
	}

}
