package com.example.demo_two.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "school")
public class school {
    private String name;
    private String website;

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
