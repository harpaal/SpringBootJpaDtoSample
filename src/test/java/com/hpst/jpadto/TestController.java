package com.hpst.jpadto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, 
				classes = Application.class)
@AutoConfigureMockMvc
public class TestController {
	
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void getStringToModelTest() throws Exception {
        mockMvc.perform(
        				get("/jpa/myModel"))
        				.andDo(print())
        				.andExpect(status().isOk());
    }
}


