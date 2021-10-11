package by.naumenko.controller;

import by.naumenko.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping(value = "/users")
    public String listUser(Model model) {
        List<User> listUser = new ArrayList<>() {{
            add(new User(1L, "Sergey", (byte) 28, 198));
            add(new User(2L, "Anton", (byte) 13, 150));
            add(new User(3L, "Саша", (byte) 28, 125));
        }};
        model.addAttribute("listUser", listUser);
        return "users";
    }
}
