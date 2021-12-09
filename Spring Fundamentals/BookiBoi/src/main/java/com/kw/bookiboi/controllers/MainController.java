package com.kw.bookiboi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kw.bookiboi.models.Author;
import com.kw.bookiboi.models.Book;
import com.kw.bookiboi.services.BookService;

@Controller
public class MainController {

	private final BookService bookServ;
	public MainController(BookService bookServ) {
		this.bookServ = bookServ;
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
    	List<Author> authors = bookServ.allAuthors();
		model.addAttribute("authors", authors);
        return "new.jsp";
    }
    
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("banana") Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	List<Author> authors = bookServ.allAuthors();
    		model.addAttribute("authors", authors);
            return "new.jsp";
        } else {
            bookServ.saveBook(book);
            return "redirect:/";
        }
    }
	
	// ======================================
	// Edit Routes
	// ======================================

    @RequestMapping("/edit/{id}")
    public String edit(
    		@PathVariable("id") Long id, 
    		Model model) {
    	Book book = bookServ.findBook(id);
    	model.addAttribute("book", book);
    	return "edit.jsp";
    }
    
    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            bookServ.saveBook(book);
            return "redirect:/";
        }
    }	
    
	// ======================================
	// Delete Route
	// ======================================
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE) 
    public String delete(@PathVariable("id") Long id) {
    	bookServ.deleteBook(id);
    	return "redirect:/";
    }
    
    

}
