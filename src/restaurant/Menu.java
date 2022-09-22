package restaurant;

import java.util.*;

public class Menu {
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
    private ArrayList<MenuItem> desserts = new ArrayList<>();

    public Menu() {
        populateMenu();
    }

    public MenuItem getAppetizer(int index) {
        return appetizers.get(index);
    }
    public MenuItem getMainCourse(int index) {
        return mainCourses.get(index);
    }
    public MenuItem getDessert(int index) {
        return desserts.get(index);
    }

    public void populateMenu() {

    appetizers.add(new MenuItem("Mozzarella Cheese Sticks", "Delicious cheese " +
            "sticks fried to a golden brown served with Marinara sauce. ", "appetizer", 7.99));
    appetizers.add(new MenuItem("Chips N Dips", "Chips that are deliciously light, thin," +
            " and crunchy served with our dips made fresh daily.  One is our salsa and the other is " +
            "a cheesy dish with spinach. Yum! ", "appetizer", 8.99));

    mainCourses.add(new MenuItem("Chicken and Vegetables", "Grilled chicken breast with " +
            "perfect seasonings served with your choice of 2 sides. ", "mainCourse", 12.99));
    mainCourses.add(new MenuItem("Pot Roast Beef and vegetables", "Roast beef with " +
            "perfect seasonings served with roasted vegetables and your choice of another side. ",
            "mainCourse", 12.99));

    desserts.add(new MenuItem("Homemade Pumpkin Pie", "Wonderful pumpkin pie with " +
            "a perfect flaky crust. ", "dessert", 4.99));
    desserts.add(new MenuItem("Brownie Mountain", "Rich, thick chocolate brownie with " +
            "2 scoops of creamy, french vanilla ice cream topped with chocolate sauce. ", "dessert",
            6.99));
    }
}
