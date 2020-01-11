package life.crystlem.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String greeting(@RequestParam(name="greeting")String name, Model model){
        model.addAttribute("name",name);
        return  "greeting";


    }

}
