package com.todolist.todolistspringboot.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
}
