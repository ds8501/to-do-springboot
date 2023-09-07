package com.todolist.todolistspringboot.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class todoController {
    private ToDoService toDoService;

    public todoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping("/listtodo")
    public String listAlltodos(ModelMap model){
        List<ToDo> todos=toDoService.findbyUsername("divya");
        model.addAttribute("todos",todos);
        return "listtodo";
    }

    @RequestMapping(value = "/add-todo",method = RequestMethod.GET)
    public String shownewtodoPage(ModelMap model){
        return "addTodo";
    }

    @RequestMapping(value = "/add-todo",method = RequestMethod.POST)
    public String addewtodoPage(ModelMap model){
        return "redirect:listtodo";
    }
}
