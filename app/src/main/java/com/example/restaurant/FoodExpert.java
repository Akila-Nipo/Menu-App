
package com.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {

    List<String> getMenu(String meal) {
        List<String> Menu = new ArrayList<>();
        if (meal.equals("Breakfast")) {
            Menu.add("Roti");
            Menu.add("Dal");
            Menu.add("Egg");
        }
        else if (meal.equals("Lunch")) {
            Menu.add("Rice");
            Menu.add("Chicken");
            Menu.add("Fish");
        }
        else {
            Menu.add("Rice");
            Menu.add("Vegetable");
            Menu.add("Chicken");
        }
        return Menu;
    }
}
