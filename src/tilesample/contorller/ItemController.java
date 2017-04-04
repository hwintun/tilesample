package tilesample.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tilesample.item.Item;
import tilesample.item.ItemDAO;

@Controller
public class ItemController {
	
	@Autowired
	private ItemDAO itemDao;
	
	@RequestMapping(value="/i/newItem", method=RequestMethod.GET)
	public ModelAndView newItem(ModelAndView model) {
		Item item = new Item();
		model.addObject(item);
		model.setViewName("itemForm");
		return model;
	}
	
	@RequestMapping(value="/i/saveItem", method=RequestMethod.POST)
	public ModelAndView saveItem(@ModelAttribute Item item) {
		itemDao.saveOrUpdateItem(item);
		return new ModelAndView("redirect:/i/listItem");
	}
	
	@RequestMapping(value="/i/deleteItem", method=RequestMethod.GET)
	public ModelAndView deleteItem(HttpServletRequest request) {
		itemDao.deleteItem(Integer.parseInt(request.getParameter("id")), true);
		return new ModelAndView("redirect:/i/listItem");
	}
	
	@RequestMapping(value="/i/editItem", method=RequestMethod.GET)
	public ModelAndView editItem(HttpServletRequest request) {
		Item item = itemDao.selectItem(Integer.parseInt(request.getParameter("id")));
		ModelAndView model = new ModelAndView("itemForm");
		model.addObject("item", item);
		return model;
	}
	
	@RequestMapping(value="/i/listItem", method=RequestMethod.GET)
	public ModelAndView listItem(ModelAndView model){
		List<Item> listItem = itemDao.listItem();
		model.addObject("itemList", listItem);
		model.setViewName("itemList");
		return model;
	}
}
