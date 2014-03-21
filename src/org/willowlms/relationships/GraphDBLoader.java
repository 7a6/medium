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
	
	public void doLoad(PrintWriter pw)
	{
		
		Student matt = new Student("Matt", null);
        Student jessica = new Student("Jessica", null);
        Student sidney = new Student("Sidney", null);
        Student clara = new Student("Clara", null);

        try {
            template.save(matt);
            template.save(jessica);
            template.save(sidney);
            template.save(clara);

            sidney = template.findOne(sidney.getId(), Student.class);
            sidney.hasClassWith(matt);
            sidney.hasClassWith(jessica);
            sidney.hasClassWith(clara);
            template.save(sidney);

            jessica = template.findOne(jessica.getId(), Student.class);
            jessica.hasClassWith(clara);
            // We already know that roy works with greg
            template.save(jessica);
            
            // We already know craig works with roy and greg
            pw.println("Jessica= " + jessica.getId());

            pw.println(((Student)(template.findOne(sidney.getId(), Student.class))));
            
           // tx.success();
        } finally {
            
        }

	}
	
	
}
