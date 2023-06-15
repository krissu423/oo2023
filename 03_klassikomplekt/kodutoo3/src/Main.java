import java.util.List;
public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();

        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");

        carRepository.addCar(car1);
        carRepository.addCar(car2);

        List<Car> cars = carRepository.getAllCars();

        for (Car car : cars) {
            System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel());
        }
    }
}