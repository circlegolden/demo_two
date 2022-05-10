package com.example.demo_two.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@ConfigurationProperties(prefix = "home")
public class home {
    private String loc;
    private int price;
    private ArrayList<Integer> a;
    private HashMap<String,Integer> map;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Integer> getA() {
        return a;
    }

    public void setA(ArrayList<Integer> a) {
        this.a = a;
    }

    public HashMap<String, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "home{" +
                "loc='" + loc + '\'' +
                ", price=" + price +
                ", a=" + a +
                ", map=" + map +
                '}';
    }
}
