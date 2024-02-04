package com.example.demo.service;

import com.example.demo.dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Setter
@Getter
public class UserService {
     private UserDao userDao;

}
