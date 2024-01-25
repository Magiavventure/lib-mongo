package it.magiavventure.mongo.repository;

import it.magiavventure.mongo.entity.EUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<EUser, UUID> {

}
