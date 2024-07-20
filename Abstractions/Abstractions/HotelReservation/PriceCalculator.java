package Abstractions.HotelReservation;

public class PriceCalculator {
    private Season season;
    private Discount discount;
    private double priceForDay;
    private int numberOfDays;

    public PriceCalculator(Season season, Discount discount, double priceForDay, int numberOfDays) {
        this.season = season;
        this.discount = discount;
        this.priceForDay = priceForDay;
        this.numberOfDays = numberOfDays;
    }

    public double totalPrice(){
        int multiplier = season.getValue();
        double discountType = this.discount.getDiscount();
        return numberOfDays*priceForDay*multiplier*(1-discountType);
    }

}
