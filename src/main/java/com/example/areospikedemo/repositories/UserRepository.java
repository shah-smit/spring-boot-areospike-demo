package com.example.areospikedemo.repositories;

import com.example.areospikedemo.objects.User;
import java.util.Optional;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  @Cacheable(value = "test", key = "#id")
  public Optional<User> findById(int id) {
    System.out.println("Simulating a read from the main data store.");
    // In case the id doesn't exist in the cache it will "fetch" jimmy page with the requested id and add it to the cache (cache miss).
    return Optional.of(new User(id, "jimmy page", "jimmy@gmail.com", 77));
  }

  @CachePut(value = "test", key = "#user.id")
  public User save(User user) {
    System.out.println("Simulating addition of " + user + " to the main data store.");
    return user;
  }

  @CacheEvict(value = "test", key = "#id")
  public void deleteById(int id) {
    System.out.println("Simulating removal of " + id + " from the main data store.");
  }
}