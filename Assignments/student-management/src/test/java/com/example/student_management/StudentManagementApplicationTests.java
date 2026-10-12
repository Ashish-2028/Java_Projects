package com.example.student_management;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class StudentManagementApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void pagesLoad() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
        mockMvc.perform(get("/about.html")).andExpect(status().isOk());
        mockMvc.perform(get("/product.html")).andExpect(status().isOk());
        mockMvc.perform(get("/features.html")).andExpect(status().isOk());
        mockMvc.perform(get("/contact.html")).andExpect(status().isOk());
    }

}
