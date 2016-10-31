package com.todo.items.todolist;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoManager {
	
	@Autowired
	TodoItemsService ItemsService;
	
	@RequestMapping(value = "/TodoList", method = RequestMethod.GET)
	public String loginUser(ModelMap model){
		model.addAttribute("todos", ItemsService.retrieveTodos("Varun") );
		return "TodoItems";
	}
	
	@RequestMapping(value = "/AddTodo", method = RequestMethod.GET)
	public String AddTodo(){
		return "AddTodo";
	}
	
	@RequestMapping(value = "/AddTodo", method = RequestMethod.POST)
	public String RedirectAddTodo(@RequestParam String User_desc, ModelMap model){
		model.clear();
		ItemsService.addTodo("Varun", User_desc, new Date(), false);
		return "redirect:TodoList";
	}
	
}
