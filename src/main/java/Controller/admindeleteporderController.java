package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.porderDao;
import model.porder;

public class admindeleteporderController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		
		porder p=new porder();
		p.setId(id);
		
		new porderDao().delete(p);
		return new ModelAndView("AD/porder/admindeleteporder.jsp");
	}

}
