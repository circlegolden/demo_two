package com.example.demo_two.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@ConfigurationProperties(prefix = "teacher")
public class teacher_infor {
    private String name;
    private String id;
    private ArrayList<String> tea_courses;
    private school s;

    @Override
    public String toString() {
        return "teacher_infor{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", tea_courses=" + tea_courses +
                ", s=" + s.toString() +
                '}';
    }

    public school getS() {
        return s;
    }

    public void setS(school s) {
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getTea_courses() {
        return tea_courses;
    }

    public void setTea_courses(ArrayList<String> tea_courses) {
        this.tea_courses = tea_courses;
    }


}
