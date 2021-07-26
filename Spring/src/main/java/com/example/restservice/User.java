package com.example.restservice;

import com.google.gson.annotations.SerializedName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Arrays;

@Data
@Document(collection = "storyline")
public class User {
    @Id
    private String id;
    private String date;
    private String[] summary;
    private String[] segments;
    private String caloriesIdle;
    private String lastUpdate;

    public User(String id, String date, String[] summary, String[] segments, String caloriesIdle, String lastUpdate) {
        this.id = id;
        this.date = date;
        this.summary = summary;
        this.segments = segments;
        this.caloriesIdle = caloriesIdle;
        this.lastUpdate = lastUpdate;
    }
}
