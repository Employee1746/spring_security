package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/user")
    public String testUser(){
        return "test-user-page";
    }

    @GetMapping("/admin")
    public String testAdmin(){
        return "test-admin-page";
    }


}
