package restaurant;

import java.time.LocalDate;
import java.text.NumberFormat;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price = 0.00;
    NumberFormat numForm = NumberFormat.getCurrencyInstance();
    LocalDate itemDate; // date item is listed on menu
    private String newFlag; // only appears if listed within 90 days using isNew()

    public MenuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private void isNew() {
        LocalDate currentDate = LocalDate.now();
        LocalDate currentDateMinus3Months = currentDate.minusMonths(3);
        //or LocalDate ago_90days = currentDate.minus(days_90);
        //or LocalDate ago = today.minusDays(90);
        // or period days_90 = Period.ofDays(90);
        if(!itemDate.isBefore(currentDateMinus3Months)) {
            System.out.println("New!");
        }
    }

    public String toString(){
        return name + "\t" + numForm.format(price) +"\n" + description;
    }


}
