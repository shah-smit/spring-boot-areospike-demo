package com.example.areospikedemo.controllers;

import com.example.areospikedemo.objects.User;
import com.example.areospikedemo.user.UserService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

  UserService userService;

  @GetMapping("/users/{id}")
  public Optional<User> readUserById(@PathVariable("id") Integer id) {
    return userService.readUserById(id);
  }

  @PostMapping("/users")
  public void addUser(@RequestBody User user) {
    userService.addUser(user);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUserById(@PathVariable("id") Integer id) {
    userService.removeUserById(id);
  }
}
