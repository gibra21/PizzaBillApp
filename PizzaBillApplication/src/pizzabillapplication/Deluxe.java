
package pizzabillapplication;


public class Deluxe extends Pizza{
    public Deluxe(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    
    
    @Override
    public void addExtraCheese() {
        
    }
    
    @Override
    public void addExtraToppings() {
        
    }
}
