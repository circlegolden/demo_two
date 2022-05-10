package com.example.demo_two.Control;

import com.example.demo_two.config.student;
import com.example.demo_two.config.teacher_infor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControll {
    @RequestMapping(value = "/stu")
    public Object student(int id,String name){
        student stu=new student();
        stu.setId(id);
        stu.setName(name);
        return stu;
    }
    @Autowired
    private teacher_infor t;
    @RequestMapping(value = "teacher")
    public String tea_infor(){
        return t.toString();
    }

}
