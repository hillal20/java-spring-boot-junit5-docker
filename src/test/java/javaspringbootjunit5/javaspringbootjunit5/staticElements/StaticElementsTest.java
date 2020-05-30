package javaspringbootjunit5.javaspringbootjunit5.staticElements;

import javaspringbootjunit5.javaspringbootjunit5.Controllers.ExampleController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)  // is a must for junit 5
@WebMvcTest(controllers = ExampleController.class) // is a must for junit 5
class StaticElementsTest {




}