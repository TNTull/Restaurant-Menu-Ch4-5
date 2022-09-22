//Teresa Tull created this on 9-20-2022 Java ch 4 studio
package restaurant;


public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();


        System.out.println(menu.getAppetizer(0));
        System.out.println(menu.getAppetizer(1));
        System.out.println(menu.getMainCourse(0));
        System.out.println(menu.getMainCourse(1));
        System.out.println(menu.getDessert(0));
        System.out.println(menu.getDessert(1));


    }
}