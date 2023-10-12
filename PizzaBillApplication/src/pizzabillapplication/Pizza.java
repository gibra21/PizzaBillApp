
package pizzabillapplication;


public class Pizza {
    private int price;
    private Boolean veg;
    
    private int extraCheesePrice = 2;
    private int extraToppings = 1;
    private int backpack = 1;
    private int pizzaprice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsadded = false;
    private boolean isTakenAway = false;
    
    
    public Pizza(Boolean veg) {  // constructor
        this.veg = veg;
        if(this.veg) {
            this.price = 10;
        } else {
            this.price = 12;
        }
        pizzaprice = this.price;
    }
    
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese added");
        this.price += extraCheesePrice;
    }
    
    public void addExtraToppings() {
        isExtraToppingsadded = true;
        System.out.println("Extra Toppings added");
        this.price += extraToppings;
    }
    
    public void takeAway() {
        isTakenAway = true;
        System.out.println("Take away opted");
        this.price += backpack;
        
    }
    
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + pizzaprice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " +extraCheesePrice+"\n";
        }
        if(isExtraToppingsadded) {
            bill += "Extra toppings added: " +extraToppings+"\n";
        }
        if(isTakenAway) {
            bill+= "Take away " +backpack+ "\n";
        }
        
        bill += "Bill: $" +this.price+ "\n";
        System.out.println(bill);
        
        
    }
    
}
