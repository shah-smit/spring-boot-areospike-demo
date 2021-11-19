package com.example.areospikedemo.user;

import com.example.areospikedemo.objects.User;
import com.example.areospikedemo.repositories.AerospikeUserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  AerospikeUserRepository aerospikeUserRepository;

  public Optional<User> readUserById(int id) {
    return aerospikeUserRepository.findById(id);
  }

  public void addUser(User user) {
    aerospikeUserRepository.save(user);
  }

  public void removeUserById(int id) {
    aerospikeUserRepository.deleteById(id);
  }
}