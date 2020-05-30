package javaspringbootjunit5.javaspringbootjunit5.service;

import javaspringbootjunit5.javaspringbootjunit5.model.User;
import javaspringbootjunit5.javaspringbootjunit5.repo.UserRepo;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserService {

    @Autowired
    UserRepo userRepo;

   public User saveUser(User user){
       return  userRepo.save(user);

    }

   public List<User> findUsers(){
       return  userRepo.findAll();
    }


    public Optional<User> findUser(int id ){
       return  userRepo.findById(id);

    }

}
