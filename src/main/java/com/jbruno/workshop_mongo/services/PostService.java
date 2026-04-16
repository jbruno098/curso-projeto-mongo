package com.jbruno.workshop_mongo.services;

import com.jbruno.workshop_mongo.domain.Post;
import com.jbruno.workshop_mongo.repository.PostRepository;
import com.jbruno.workshop_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String txt) {
        return repository.findByTitleContainingIgnoreCase(txt);
    }
}

