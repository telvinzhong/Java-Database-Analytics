package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
  @Autowired
  UserRepository repository;

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

    //get HTTP request....
  @GetMapping("/dates")
  public ArrayList<String> getDates() {
    List<User> list = repository.findAll();
    ArrayList<String> userDates = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      System.out.println(list.get(i).getDate());
      userDates.add(list.get(i).getDate());
    }
    return userDates;
  }
}