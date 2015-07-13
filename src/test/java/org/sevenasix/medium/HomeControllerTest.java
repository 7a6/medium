package org.sevenasix.medium;

import org.junit.Test;
import org.sevenasix.medium.web.HomeController;
import org.sevenasix.medium.web.RegistrationController;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {


    @Test
    public void verifyHomeControllerView() throws Exception {

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(view().name("home"));
    }

    @Test
    public void shouldShowRegistrationPage() throws Exception {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new RegistrationController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/register")).andExpect(status().isOk())
                .andExpect(view().name("signup"));
    }

    @Test
    public void shouldShowErrorTemplate() throws Exception{
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).setViewResolvers(resolver).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/error")).andExpect(status().isOk())
                .andExpect(view().name("error"));

    }

    @Test
    public void shouldRegisterUser(){


    }

}
