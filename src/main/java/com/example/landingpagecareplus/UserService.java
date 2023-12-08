package com.example.landingpagecareplus;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User save(User user);
    User findByPhoneNumber(String phoneNumber);
}
