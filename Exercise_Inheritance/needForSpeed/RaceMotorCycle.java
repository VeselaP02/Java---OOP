package Exercise_Inheritance.needForSpeed;

public class RaceMotorCycle extends MotorCycle{

    private static final double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorCycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
