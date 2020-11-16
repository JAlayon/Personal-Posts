package com.alayon.services;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alayon.models.Post;
import com.alayon.models.PostRequest;
import com.alayon.repositories.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post savePost(final PostRequest postRequest) {
		log.info("In Post Service Layer");
		final Post post = new Post();
		final Date fechaActual = new Date();
		BeanUtils.copyProperties(postRequest, post);
		post.setFechaAlta(fechaActual);
		post.setFechaModificacion(fechaActual);
		return postRepository.save(post);
	}

}
