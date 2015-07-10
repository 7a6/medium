package org.sevenasix.medium;

import org.junit.Test;
import org.sevenasix.medium.web.HomeController;
import org.sevenasix.medium.web.RegistrationController;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class HomeControllerTest {

    @Test
    public void verifyHomeControllerView() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(view().name("home"));
    }

    @Test
    public void shouldShowRegistrationPage() throws Exception {
        RegistrationController controller = new RegistrationController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/signup")).andExpect(status().isOk()).andDo(print());
                //.andExpect(content().string(containsString("signup")));
    }

    @Test
    public void shouldRegisterUser(){


    }

}
