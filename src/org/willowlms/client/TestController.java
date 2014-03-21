package org.willowlms.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/test")
public class TestController {

	
	@RequestMapping(method = RequestMethod.GET)
	public void doStuff(
			HttpServletRequest req,
			HttpServletResponse res) {
		
		PrintWriter pw;
		try {
			pw = res.getWriter();
			pw.write("hello man!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
