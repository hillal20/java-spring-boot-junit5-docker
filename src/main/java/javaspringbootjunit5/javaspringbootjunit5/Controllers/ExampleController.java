package javaspringbootjunit5.javaspringbootjunit5.Controllers;


import javaspringbootjunit5.javaspringbootjunit5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

@Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
