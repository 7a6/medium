package org.willowlms.relationships;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.willowlms.actors.Student;

public class GraphDBLoader {

	Neo4jTemplate template;
	
	public GraphDBLoader(Neo4jTemplate template)
	{
		
		this.template = template;
	}
	
	//for now just a junk method to connect Neo4j to Spring
	public void doLoad(PrintWriter pw)
	{
		
		Student bill = new Student("Bill", null);
        Student jose = new Student("Jose", null);
        Student jane = new Student("Jane", null);
        Student mary = new Student("Mary", null);

        try {
            template.save(bill);
            template.save(jose);
            template.save(jane);
            template.save(mary);

            jane = template.findOne(jane.getId(), Student.class);
            jane.hasClassWith(bill);
            jane.hasClassWith(jose);
            jane.hasClassWith(mary);
            template.save(jane);

            jose = template.findOne(jose.getId(), Student.class);
            jose.hasClassWith(mary);
            template.save(jose);
            
            pw.println("Jose = " + jose.getId());

            pw.println(((Student)(template.findOne(jane.getId(), Student.class))));
            

        } finally {
            
        }

	}
	
	
}
