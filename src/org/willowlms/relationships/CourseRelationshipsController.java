package org.willowlms.relationships;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




//import org.neo4j.graphdb.GraphDatabaseService;
//import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.willowlms.actors.Student;
import org.willowlms.data.StudentGraphRepository;

@Lazy
@Controller
@Configuration
@EnableNeo4jRepositories
public class CourseRelationshipsController extends Neo4jConfiguration {
   

	
	/*@Autowired
	SpringRestGraphDatabase graphdb;
    @Autowired
	StudentGraphRepository personRepository ;//=  (StudentGraphRepository)template.repositoryFor(Student.class);    */
	@Autowired
	Neo4jTemplate template;

    @RequestMapping(value="/helloWorld", method = RequestMethod.GET)
    public void loadDB(HttpServletResponse res, HttpServletRequest req) throws Exception {
    	
        PrintWriter pw = res.getWriter();
        pw.println("Before linking up with Neo4j...");

        GraphDBLoader g = new GraphDBLoader(template);
        g.doLoad(pw);
    	
       
    }



}

