package com.jbruno.workshop_mongo.resources;

import com.jbruno.workshop_mongo.domain.Post;
import com.jbruno.workshop_mongo.resources.util.URL;
import com.jbruno.workshop_mongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Date;
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

    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String txt) {
        txt = URL.decodeParam(txt);
        List<Post> list = service.findByTitle(txt);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/findbydates")
    public ResponseEntity<List<Post>> findBetweenDates(
            @RequestParam(value = "text", defaultValue = "") String txt,
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate) {
        txt = URL.decodeParam(txt);
        Date min = URL.convertDate(minDate, new Date(0L));
        Date max = URL.convertDate(maxDate, new Date());
        List<Post> list = service.findBetweenDates(txt, min, max);
        return ResponseEntity.ok().body(list);
    }
}
