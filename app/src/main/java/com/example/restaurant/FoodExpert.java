
package com.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {

    List<String> getMenu(String meal) {
        List<String> Menu = new ArrayList<>();
        if (meal.equals("Front-End Package")) {
            Menu.add("React");
            Menu.add("JavaScript");
            Menu.add("Vite on Node.js platform");
        }
        else if (meal.equals("Back-End Package")) {
            Menu.add("Django");
            Menu.add("Python");
            Menu.add("Heroku on Python platform");
        }
        else {
            Menu.add("Angular");
            Menu.add("Express.js");
            Menu.add("AWS with TypeScript/JavaScript");
        }
        return Menu;
    }
}
