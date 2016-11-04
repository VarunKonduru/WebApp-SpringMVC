package com.todo.items.todolist;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoItemsService {
	    private static List<TodoItems> todos = new ArrayList<TodoItems>();
	    private static int todoCount = 3;

	    static {
	        todos.add(new TodoItems(1, "Varun", "step one", new Date(),
	                false));
	        todos.add(new TodoItems(2, "Varun", "step two", new Date(), false));
	        todos.add(new TodoItems(3, "Varun", "step three", new Date(),
	                false));
	    }
	    
	    public void addTodo(String user_name, String user_desc, Date targetDate, boolean isDone) {
	        todos.add(new TodoItems(++todoCount, user_name, user_desc, targetDate, isDone));
	    }
	    
	    public List<TodoItems> retrieveTodos(String user) {
	        List<TodoItems> filteredTodos = new ArrayList<TodoItems>();
	        for (TodoItems todo : todos) {
	            if (todo.getUser_name().equals(user))
	                filteredTodos.add(todo);
	        }
	        return filteredTodos;
	    }
	    
	    public void deleteTodo(int id) {
	        Iterator<TodoItems> iterator = todos.iterator();
	        while (iterator.hasNext()) {
	            TodoItems todo = iterator.next();
	            if (todo.getId() == id) {
	                iterator.remove();
	            }
	        }
	        
	    }
	    
}
