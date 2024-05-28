import java.util.Arrays;

public class Dealership {
  private Car[] cars;

  public Dealership(Car[] cars) {
    this.cars = Arrays.copyOf(cars, cars.length);
  }

  public Car[] getCars() {
    return Arrays.copyOf(this.cars, this.cars.length);
  }

  public void setCars(Car[] cars) {
    this.cars = Arrays.copyOf(cars, cars.length);
  }

}
