package com.example.areospikedemo.controllers;

import com.example.areospikedemo.objects.User;
import com.example.areospikedemo.repositories.UserRepository;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCacheController {

  UserRepository userRepository;

  @GetMapping("/cache/users/{id}")
  public Optional<User> readUserById(@PathVariable("id") Integer id) {
    return userRepository.findById(id);
  }

  @PostMapping("/cache/users")
  public void addUser(@RequestBody User user) {
    userRepository.save(user);
  }

  @DeleteMapping("/cache/users/{id}")
  public void deleteUserById(@PathVariable("id") Integer id) {
    userRepository.deleteById(id);
  }
}