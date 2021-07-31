package com.example.restservice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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

  @GetMapping("/user")
  public List<User> getSummary() {
    List<User> list = repository.findAll();
    return list;
  }

  @GetMapping("/index")
  public ModelAndView showCities() {

    List<User> users = repository.findAll();
    List<User> list = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      list.add(users.get(i));
    }
    Map<String, Object> params = new HashMap<>();
    params.put("user", list);

    return new ModelAndView("activity", params);
  }

  @PutMapping("/update/{id}")
  User updateUser(@RequestBody User user, @PathVariable String id) {

    return repository.findById(id)
            .map(oldUser -> {
              oldUser.setCaloriesIdle(user.getCaloriesIdle());
              oldUser.setSummary(user.getSummary());
              return repository.save(user);
            })
            .orElseGet(() -> {
              user.setId(id);
              return repository.save(user);
            });
  }

  @DeleteMapping("/delete/{id}")
  void deleteEmployee(@PathVariable String id) {
    repository.deleteById(id);
  }
}