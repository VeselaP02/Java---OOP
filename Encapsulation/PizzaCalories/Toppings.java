package PizzaCalories;

public class Toppings {
    private String toppingType;
    private double weight;

    public Toppings(String toppingType, double weight) {
       this.setToppingType(toppingType);
       this.setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (toppingType != this.toppingType){
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",toppingType));
        }
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight <= 0 || weight > 50){
            throw  new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",toppingType));
        }
        this.weight = weight;
    }

}
