package it.magiavventure.mongo.repository;

import it.magiavventure.mongo.entity.EStory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StoryRepository extends MongoRepository<EStory, UUID> { }
