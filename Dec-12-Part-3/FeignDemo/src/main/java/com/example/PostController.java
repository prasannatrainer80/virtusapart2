package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/subpost")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value="/showpost")
    public List<Post> getAllPosts(){
        return postService.getPosts();
    }

    @GetMapping(value="/search/{id}")
    public Post getById(@PathVariable int id){
        return postService.getById(id);
    }
}
