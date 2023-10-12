
package pizzabillapplication;


public class PizzaBillApplication {

  
    public static void main(String[] args) {
        Pizza customerPizza = new Pizza(true);
        customerPizza.addExtraToppings();
        customerPizza.addExtraCheese();
        customerPizza.getBill();
        
        
        
        Deluxe deluxepizza = new Deluxe(true);
        deluxepizza.getBill();
        deluxepizza.addExtraCheese();
        deluxepizza.addExtraToppings();
       
    }
    
    
    
}
