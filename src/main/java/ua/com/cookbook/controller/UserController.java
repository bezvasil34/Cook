package ua.com.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.cookbook.entity.User;
import ua.com.cookbook.service.MailSenderService;
import ua.com.cookbook.service.UserService;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MailSenderService mailSenderService;

    @RequestMapping(value = "/registration")
    public String registration(){
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signUp(@RequestParam String username, @RequestParam String email,
                         @RequestParam String password){

        String content = "some content";
        String mailBody = "mail body";
        mailSenderService.sendMail(content,email,mailBody);

        userService.save(new User(username,password,email));
        return "redirect:/home";
    }
}
