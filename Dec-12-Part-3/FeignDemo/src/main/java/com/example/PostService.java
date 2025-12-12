package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private ThirdPartyClient thirdPartyClient;

    public List<Post> getPosts() {
        return thirdPartyClient.getPosts();
    }

    public Post getById(int id) {
        return thirdPartyClient.searchById(id);
    }

}
