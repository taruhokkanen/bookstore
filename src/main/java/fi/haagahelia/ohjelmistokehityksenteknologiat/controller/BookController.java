package fi.haagahelia.ohjelmistokehityksenteknologiat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	@RequestMapping(value="/index") 
	public String entieda(@RequestParam(value="title")String title, @RequestParam(value="author")String author, @RequestParam(value="year")int year, @RequestParam(value="isbn")int isbn, @RequestParam(value="price")double price, Model model) {
		
		model.addAttribute("title", title);
		model.addAttribute("author", author);
		model.addAttribute("year", year);
		model.addAttribute("isbn", isbn);
		model.addAttribute("price", price);
		
		return "index";
	}
	
}
