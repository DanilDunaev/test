package com.example.demo.service;

import com.example.demo.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
     private UserDao userDao;

}
