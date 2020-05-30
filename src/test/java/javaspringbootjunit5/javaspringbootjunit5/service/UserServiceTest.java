package javaspringbootjunit5.javaspringbootjunit5.service;

import javaspringbootjunit5.javaspringbootjunit5.model.User;
import javaspringbootjunit5.javaspringbootjunit5.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;



@ExtendWith(SpringExtension.class)  // is a must for junit 5
@SpringBootTest// is a must for junit 5
class UserServiceTest {

   @Autowired
   UserService userService;

    @MockBean
    UserRepo userRepo;

    @Test
    void saveUser(){
         User user = new User(2, "bill", "fill");
       when(userRepo.save(user)).thenReturn(user); // once the repo get called, we mock the return
       assertEquals(user, userService.saveUser(user));
    }
    @Test
    void findUsers(){
        List<User> users =  new ArrayList<>();
        users.add(new User(2, "bill", "fill"));
        users.add(new User(1, "hill", "bill"));
        when(userRepo.findAll()).thenReturn(users);
        assertEquals(users, userService.findUsers());

    }


    @Test
    void findUser(){
        User user = new User(2, "bill", "fill");
        when(userRepo.findById(2)).thenReturn(Optional.of(user));
        assertEquals(Optional.of(user) ,userService.findUser(2));

    }
}