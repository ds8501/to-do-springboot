package com.todolist.todolistspringboot.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {

    private static List<ToDo> todos=new ArrayList<>();
    static {
        todos.add(new ToDo(1,"divya","complete java",
                LocalDate.now().plusDays(2),false));
        todos.add(new ToDo(1,"divya","complete flutter",
                LocalDate.now().plusDays(2),true));
        todos.add(new ToDo(1,"divya","complete devops",
                LocalDate.now().plusDays(2),false));
    }

    public List<ToDo> findbyUsername(String username){
        return todos;
    }
}
