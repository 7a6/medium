package org.sevenasix.medium.registrar;

import org.sevenasix.medium.actors.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {

    @RequestMapping("student")
    public Student student(@RequestParam(value="name", defaultValue="Student") String name){

        return new Student(name);
    }


}
