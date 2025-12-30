package com.example.repo;

import com.example.model.Employ;
import com.example.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login,String> {
    Login findByUsernameAndPasscode(String username, String passcode);
}
