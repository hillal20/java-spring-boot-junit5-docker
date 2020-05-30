package javaspringbootjunit5.javaspringbootjunit5.Controllers;

import javaspringbootjunit5.javaspringbootjunit5.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)  // is a must for junit 5
@WebMvcTest(controllers = ExampleController.class) // is a must for junit 5
class ExampleControllerTest {

    @MockBean
    UserService userService;

    @Autowired
     private  MockMvc mockMvc;

    @Test
    void helloTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/hello");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("hello world", result.getResponse().getContentAsString());


    }

}