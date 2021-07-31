package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
  private final UserRepository repository;

  UserController(UserRepository repository) {
    this.repository = repository;
  }

  @PostMapping("/create")
  User createUser(@RequestBody User user) {
    return repository.save(user);
  }

  @GetMapping("/summary")
  public List<String> getSummary() {
    List<User> list = repository.findAll();
    List<String> summaryList = new ArrayList<String>();
    return summaryList;
  }

  @PutMapping("/user/{date}")
  User updateUser(@RequestBody User user, @PathVariable String date) {

    return repository.findById(date)
            .map(employee -> {
              employee.setCaloriesIdle(user.getCaloriesIdle());
              employee.setSummary(user.getSummary());
              return repository.save(user);
            })
            .orElseGet(() -> {
              user.setId(date);
              return repository.save(user);
            });
  }

  @DeleteMapping("/user/{date}")
  void deleteEmployee(@PathVariable String date) {
    repository.deleteById(date);
  }
}