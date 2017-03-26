package org.launchcode.controllers;

import org.launchcode.models.User;
import org.launchcode.models.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Andrew Bell on 3/22/17.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("title", "Add User");
        return "users/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, @RequestParam String verify){
        if(verify.equals(user.getPassword())){
            model.addAttribute("title", "Add User");
            model.addAttribute("newUser", user.getUsername());
            model.addAttribute(user);
            UserData.add(user);
            return "users/index";
        } else {
            model.addAttribute("title", "Add User");
            model.addAttribute("error", "Passwords do not match");
            model.addAttribute(user);
            return "users/add";
        }
    }

}
