package org.perscholas.sprintboot.controller;

import org.perscholas.sprintboot.database.entity.User;
import org.springframework.stereotype.Controller;

@Controller
public class SlashController {

    public  void  index(){

        User user = new User();
        user.setId(1);
        user.setUserName("Lara");
    }
}
