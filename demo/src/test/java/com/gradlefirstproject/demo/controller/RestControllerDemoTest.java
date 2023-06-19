package com.gradlefirstproject.demo.controller;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RestControllerDemo.class)
@ExtendWith(SpringExtension.class)
public class RestControllerDemoTest {
   @Autowired
    MockMvc mockMvc;
   @Test
    void helloWorld() throws Exception{
       mockMvc.perform(get("/api/v1/demo"))
                .andExpect(status().isOk());

   }
}
