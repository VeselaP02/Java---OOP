package Abstractions.HotelReservation;

public enum Discount {
    VIP(0.2),
    SecondVisit(0.1),
    None(0);

    private double discount;
    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    public static Discount discountFromString(String discountType){
        return Discount.valueOf(discountType);
    }
}
