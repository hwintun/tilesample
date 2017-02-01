package tilesample.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tilesample.customer.Customer;
import tilesample.customer.CustomerDAO;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDAO customerDao;
	
	@RequestMapping(value="/c/newCustomer", method=RequestMethod.GET)
	public ModelAndView newCustomer(ModelAndView model) {
		Customer customer = new Customer();
		model.addObject(customer);
		model.setViewName("customerForm");
		return model;
	}
	
	@RequestMapping(value="/c/saveCustomer", method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		customerDao.saveOrUpdateControl(customer);
		return new ModelAndView("redirect:/c/listCustomer");
		//System.out.println(customer.toString());
		//return null;
	}
	
	@RequestMapping(value="/c/deleteCustomer", method=RequestMethod.GET)
	public ModelAndView deleteCustomer(HttpServletRequest servlet) {
		customerDao.deleteCustomer(Integer.parseInt(servlet.getParameter("id")));
		return new ModelAndView("redirect:/c/listCustomer");
	}
	
	@RequestMapping(value="/c/updateCustomer", method=RequestMethod.GET)
	public ModelAndView editCustomer(HttpServletRequest servlet) {
		Customer customer = customerDao.selectCustomer(Integer.parseInt(servlet.getParameter("id")));
		ModelAndView model = new ModelAndView("customerForm");
		model.addObject("customer", customer);
		return model;
	}
	
	@RequestMapping(value="/c/listCustomer", method=RequestMethod.GET)
	public ModelAndView listCustomer(ModelAndView model) {
		List<Customer> listCustomer = customerDao.listCustomer();
		model.addObject("customerList", listCustomer);
		model.setViewName("customerList");
		return model;
	}
}
