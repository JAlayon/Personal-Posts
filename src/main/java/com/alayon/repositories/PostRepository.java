package com.alayon.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alayon.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
