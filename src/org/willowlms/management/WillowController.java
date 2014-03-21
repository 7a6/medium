package org.willowlms.management;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

//import com.sevenasix.rhizome.SiteController;

public class WillowController {

    
    public void onStartup(ServletContext container) {
        /*ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/home/*");*/
    }

}
