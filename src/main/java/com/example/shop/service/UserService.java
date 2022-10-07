package com.example.shop.service;

import com.example.shop.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    /**
     * 전체 조회
     * */
    public List<User> findAll() {
        return null;
    }

    /**
     * 아이디로 조회
     * */
    public User findById(String userId) {
        return null;
    }
}
