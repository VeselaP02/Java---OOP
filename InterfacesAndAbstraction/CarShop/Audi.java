package InterfacesAndAbstraction.CarShop;

public class Audi extends CarImpl implements Rentable{

    private final Integer minRentDay;
    private final Double pricePerDay;


    public Audi(String model, String color, Integer horsePower, String countryProduced,Integer minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "Minimum rental period of " + this.minRentDay + "days. Price per day " + this.pricePerDay;
    }
}
