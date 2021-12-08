package com.kw.bookiboi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kw.bookiboi.models.Book;
import com.kw.bookiboi.services.BookService;

@Controller
public class MainController {

	private final BookService bookServ;
	public MainController(BookService bookServ) {
		this.bookServ = bookServ;
	}
	
	@RequestMapping("/data")
	public String data() {
		return "Welll hello there!";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Book> books = bookServ.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	// ======================================
	// Create Routes
	// ======================================

	    
    @RequestMapping("/new")
    public String newBook(@ModelAttribute("banana") Book book, Model model) {
//    	model.addAttribute("book", new Book());
    	List<Book> books = bookServ.allBooks();
		model.addAttribute("books", books);
        return "new.jsp";
    }
    
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("banana") Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	System.out.println(result);
        	List<Book> books = bookServ.allBooks();
    		model.addAttribute("books", books);
            return "new.jsp";
        } else {
            bookServ.createBook(book);
            return "redirect:/";
        }
    }

}
