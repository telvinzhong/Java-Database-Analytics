package com.example.restservice.controller;

import com.example.restservice.UserRepository;
import com.example.restservice.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
public class UserController {
  private final UserRepository repository;

  UserController(UserRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/")
  public String getHome() {
    String home = new String("Project Group One: Check https://github.com/telvinzhong/Java-Database-Analytics for documentation");
    return home;
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

  @PutMapping("/update/{id}")
  User updateUser(@RequestBody User user, @PathVariable String id) {
    return repository.findById(id)
            .map(oldUser -> {
              oldUser.setCaloriesIdle(user.getCaloriesIdle());
              oldUser.setDate(user.getDate());
              return repository.save(user);
            })
            .orElseGet(() -> {
              user.setId(id);
              return repository.save(user);
            });
  }

  @DeleteMapping("/delete/{id}")
  void deleteUser(@PathVariable String id) {
    repository.deleteById(id);
  }

  @GetMapping("/index")
  public ModelAndView showUsers() {
    List<User> users = repository.findAll();
    List<User> list = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      list.add(users.get(i));
    }
    Map<String, Object> params = new HashMap<>();
    params.put("user", list);

    return new ModelAndView("user", params);
  }

  @GetMapping("/duration")
  public ModelAndView showDuration() {
    List<User> users = repository.findAll();
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      User user = users.get(i);
      List<String> str = user.getSummary();
      int total = 0;
      for (String ss : str) {
        int start = ss.indexOf("duration");
        int j = start;
        while (j < ss.length() && ss.charAt(j) != ',') {
          j++;
        }
        int time = Integer.valueOf(ss.substring(start + 11, j));
        total += time;
      }

      list.add("Date: " + user.getDate() + " --------> " + "Total activity time is: " + String.valueOf(total));
    }
    Map<String, Object> params = new HashMap<>();
    params.put("user", list);
    return new ModelAndView("duration", params);
  }

  @GetMapping("/activity")
  public ModelAndView showActivity() {
    List<User> users = repository.findAll();
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      User user = users.get(i);
      List<String> str = user.getSummary();
      List<String> total = new ArrayList<>();
      for (String ss : str) {
        int start = ss.indexOf("activity");
        int j = start + 12;
        while (j < ss.length() && ss.charAt(j) != '"') {
          j++;
        }
        String act = ss.substring(start + 12, j);
        total.add(act);
      }
      list.add("Date: " + user.getDate() + " --------> " + "Activities are: " + total);
    }
    Map<String, Object> params = new HashMap<>();
    params.put("user", list);
    return new ModelAndView("activity", params);
  }
}