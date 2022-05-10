package com.example.demo_two.Control;

import com.example.demo_two.config.home;
import com.example.demo_two.config.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class webControl {
    @Value("${school.name}")
    private String sn;
    @Value("${school.website}")
    private String sw;
    //引入自动注入
    @Autowired
    private school s;
    @Autowired
    private home h;
    @RequestMapping (value="/hello")
    public @ResponseBody String str(){
        return h.toString();
    }

}
