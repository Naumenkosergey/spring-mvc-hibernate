package by.naumenko.model;

import java.util.ArrayList;
import java.util.List;

public class UserTestNoDB {

    //для теста, без бд
    private static List<User> users = new ArrayList<>() {{
        add(new User(1L, "Sergey", (byte) 28, 198));
        add(new User(2L, "Anton", (byte) 13, 150));
        add(new User(3L, "Саша", (byte) 28, 125));
    }};

    public static List<User> getUsers() {
        return users;
    }



}
