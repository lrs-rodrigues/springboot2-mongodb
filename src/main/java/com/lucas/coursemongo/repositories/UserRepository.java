package com.lucas.coursemongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas.coursemongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
