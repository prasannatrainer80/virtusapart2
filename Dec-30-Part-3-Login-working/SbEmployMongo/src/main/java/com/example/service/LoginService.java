package com.example.service;

import com.example.model.Login;
import com.example.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;


    public List<Login> show() {
        return loginRepository.findAll();
    }
    public int check(String user, String pwd) {
        Login login =  loginRepository.findByUsernameAndPasscode(user, pwd);
        if (login != null) {
            return 1;
        } else {
            return 0;
        }
    }
}
