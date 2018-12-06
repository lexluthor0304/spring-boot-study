package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class usersController {

    @RequestMapping("/for")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "for";
    }

    private List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("わたる一号", 12 ,"123456");
        User user2 = new User("わたる二号", 6, "123456");
        User user3 = new User("わたる三号", 66, "123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
