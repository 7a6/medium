package org.sevenasix.medium.actors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Names are not parsed into discrete units such as first and last name, given and surname, prior to storage. Rather,
 */
@Document
public class Student implements User {
    @Id
    private String studentID;


    private String name;

    @Override
    public String getID() {
        return studentID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
