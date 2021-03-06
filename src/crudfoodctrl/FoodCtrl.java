
package crudfoodctrl;

import crudmoodmodel.Mood;
import crudfoodmodel.Food;
import crudfoodview.FoodView;

public class FoodCtrl {
    
    /**
     * Constructor for creating FoodCtrl objects
     */
    public FoodCtrl(){
        displayView();
    }
    
    /**
     * This method will update the food name
     * @param foodName Name of the food entered
     */
    public void updateFoodName (String foodName) {

    }
    /**
     * This method will update the time entered
     * @param timeEntered Time food was entered
     */
    public void updateTimeEntered (String timeEntered) {

    }
    /**
     * This method will update the quantity entered
     * @param foodQuantity The quantity of food entered
     */
    public void updateFoodQuantity (String foodQuantity) {

    }
    /**
     * This method will update the mood associated with a food
     * @param mood Mood connected to food entered
     */
    public void updateFoodMood (Mood mood) {
        
    }
    
    public void displayView () {
        System.out.println("`-Instantiating Food object");
        //Food food = new Food();
        System.out.printf("`-F Instantiated\n`-Building FoodView\n");
        //FoodView FoodUI = new FoodView(food);
    }
    
}
