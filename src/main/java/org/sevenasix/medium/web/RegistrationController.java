package org.sevenasix.medium.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by matt on 7/9/15.
 */
@Controller
@RequestMapping({"/signup"})
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String signup(){
        return "register";

    }
}
