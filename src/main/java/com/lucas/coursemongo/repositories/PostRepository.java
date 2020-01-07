package com.lucas.coursemongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucas.coursemongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
