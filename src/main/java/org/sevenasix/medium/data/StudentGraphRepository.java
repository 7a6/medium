package org.willowlms.data;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.willowlms.actors.Student;

public interface StudentGraphRepository extends GraphRepository <Student> {
Student findByName(String name
        );

Iterable <Student> findByClassmatesName(String name
        );
}