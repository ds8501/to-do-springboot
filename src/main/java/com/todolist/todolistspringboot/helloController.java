package com.todolist.todolistspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sahello(){
        return "Helllo!! how are you felling today";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayhtml(){
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first html page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/hellojsp")
   // @ResponseBody
    public String sayhellojsp(){
        return "sayHello";
    }

}
