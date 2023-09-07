package com.todolist.todolistspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
   // @ResponseBody
    public String gotologinPage(@RequestParam String name, ModelMap model){
       model.put("name",name);
        return "login";
    }
}
