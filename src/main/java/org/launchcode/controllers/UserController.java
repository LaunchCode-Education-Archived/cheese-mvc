package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify) {

        if (user.getPassword() != null
                && user.getPassword().equals(verify)) {
            model.addAttribute("name", user.getUsername());
            return "user/index";
        }

        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("error", "Passwords do not match");
        return "user/add";

    }


}
