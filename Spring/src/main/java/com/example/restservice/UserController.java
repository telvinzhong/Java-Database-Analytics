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

  @GetMapping("/summary")
  public List<String> getSummary() {
    List<User> list = repository.findAll();
    List<String> summaryList = new ArrayList<String>();
    return summaryList;
  }
}