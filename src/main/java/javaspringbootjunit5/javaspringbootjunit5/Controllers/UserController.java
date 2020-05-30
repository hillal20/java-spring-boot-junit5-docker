package javaspringbootjunit5.javaspringbootjunit5.Controllers;


import javaspringbootjunit5.javaspringbootjunit5.model.User;
import javaspringbootjunit5.javaspringbootjunit5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/save")
   public User  saveUser(@RequestBody User user ){
        System.out.println("request ===> "+ user);
         return userService.saveUser(user);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
   public List<User> getAllUsers(){
       return  userService.findUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable  String id){
        System.out.println("id ===> " + id );
        return  userService.findUser(Integer.parseInt(id));

    }


}
