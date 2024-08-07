package InterfacesAndAbstraction.CarShop;

public interface Rentable {

    Integer getMinRentDay();
    double getPricePerDay();

    class Main {
        public static void main(String[] args) {
            Car seat = new Seat("Leon","gray",110,"Spain",1111.1);
            Car audi = new Audi("Leon","gray",110,"Spain",3,99.9);


            printCarInfo(seat);
            printCarInfo(audi);
        }

        private static void printCarInfo(Car car) {
            System.out.printf("%s is %s color and have %s horse power%n", car.getModel(),
                    car.getColor(),
                    car.getHorsePower());

            System.out.println(car);
        }
    }
}
