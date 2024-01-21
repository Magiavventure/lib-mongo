package it.magiavventure.mongo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
@ComponentScan("it.magiavventure.mongo")
public class MongoConfig {

}
