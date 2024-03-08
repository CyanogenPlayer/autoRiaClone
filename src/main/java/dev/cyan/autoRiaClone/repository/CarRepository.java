package dev.cyan.autoRiaClone.repository;

import dev.cyan.autoRiaClone.entity.Car;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {
    Optional<Car> findById(String id);

    void deleteById(String id);
}
