package it.magiavventure.mongo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoAuditing
@EnableMongoRepositories("it.magiavventure.mongo.repository")
@ComponentScan("it.magiavventure.mongo")
public class MongoConfig {

}
