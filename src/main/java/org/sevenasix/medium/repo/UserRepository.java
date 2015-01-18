package org.sevenasix.medium.repo;

import org.sevenasix.medium.actors.Student;
import org.sevenasix.medium.actors.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by matt on 1/6/15.
 */
public interface UserRepository extends MongoRepository<User, Long> {

}
