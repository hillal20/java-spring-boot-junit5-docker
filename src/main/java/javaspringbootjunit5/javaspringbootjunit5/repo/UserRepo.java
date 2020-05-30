package javaspringbootjunit5.javaspringbootjunit5.repo;

import javaspringbootjunit5.javaspringbootjunit5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<User, Integer> {




}
