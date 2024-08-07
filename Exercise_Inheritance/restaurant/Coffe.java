package Exercise_Inheritance.restaurant;

import java.math.BigDecimal;

public class Coffe extends HotBeverage{

    private static final double COFFE_MILLILITERS = 50;
    private static final BigDecimal COFFE_PRICE = BigDecimal.valueOf(3.5);
    private double caffeine;

    public Coffe(String name, BigDecimal price, double milliliters,double caffeine) {
        super(name, price, milliliters);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
