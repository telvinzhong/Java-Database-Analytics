package com.example.restservice;

import com.google.gson.annotations.SerializedName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@Document(collection = "storyline")
public class User {
    @Id
    private String id;
    private String date;
    private List<String> summary;
    private List<String> segments;
    private String caloriesIdle;
    private String lastUpdate;

    public User(String id, String date, List<String> summary, List<String> segments, String caloriesIdle, String lastUpdate) {
        this.id = id;
        this.date = date;
        this.summary = summary;
        this.segments = segments;
        this.caloriesIdle = caloriesIdle;
        this.lastUpdate = lastUpdate;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public List<String> getSummary() {
        return summary;
    }

    public List<String> getSegments() {
        return segments;
    }

    public String getCaloriesIdle() {
        return caloriesIdle;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSummary(List<String> summary) {
        this.summary = summary;
    }

    public void setSegments(List<String> segments) {
        this.segments = segments;
    }

    public void setCaloriesIdle(String caloriesIdle) {
        this.caloriesIdle = caloriesIdle;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
