package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name="jsonPlaceholderClient",
        url="https://jsonplaceholder.typicode.com/"
)

public interface ThirdPartyClient {

    @GetMapping(value="/posts")
    List<Post> getPosts();
    @GetMapping(value="/posts/{id}")
    Post searchById(@PathVariable int id);
}
