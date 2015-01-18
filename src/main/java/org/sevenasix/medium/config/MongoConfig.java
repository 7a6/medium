package org.sevenasix.medium.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by matt on 1/17/15.
 */
@Configuration
@EnableMongoRepositories(basePackages = {"org.sevenasix.medium.actors"})
public class MongoConfig extends AbstractMongoConfiguration{


    @Override
    protected String getDatabaseName() {
        return "profiles";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }
}
