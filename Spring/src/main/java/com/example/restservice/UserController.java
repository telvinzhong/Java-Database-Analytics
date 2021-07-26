package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
  @Autowired
  UserRepository repository;

  @GetMapping("/dates")
  public ArrayList<String> getDates() {
    List<User> list = repository.findAll();
    ArrayList<String> userDates = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      userDates.add(list.get(i).getDate());
    }
    return userDates;
  }

  @GetMapping("/segments")
  public ArrayList<String> getSegments() {
    List<User> list = repository.findAll();
    ArrayList<String> userSegments = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      userSegments.add(list.get(i).getSegments().toString());
    }
    return userSegments;
  }

  @GetMapping("/segments")
  public ArrayList<String> getLastUpdate() {
    List<User> list = repository.findAll();
    ArrayList<String> userLastUpdate = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      userLastUpdate.add(list.get(i).getLastUpdate());
    }
    return userLastUpdate;
  }
}