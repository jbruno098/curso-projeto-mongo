package com.jbruno.workshop_mongo.resources;

import com.jbruno.workshop_mongo.domain.Post;
import com.jbruno.workshop_mongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
      Post obj = service.findById(id);
      return ResponseEntity.ok().body(obj);
    }
}
