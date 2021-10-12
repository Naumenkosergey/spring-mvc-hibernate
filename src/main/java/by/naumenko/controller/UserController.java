package by.naumenko.controller;

import by.naumenko.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping(value = "/users")
    public String getAllUser(Model model) {
        model.addAttribute("listUser", userService.getAllUser());
        return "users";
    }
}
