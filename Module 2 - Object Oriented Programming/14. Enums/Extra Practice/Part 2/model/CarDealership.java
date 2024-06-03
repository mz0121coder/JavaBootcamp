package model;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
  private List<Car> cars;

  public CarDealership() {
    this.cars = new ArrayList<>();
  }

  public Car getCar(int index) {
    return new Car(this.cars.get(index));
  }

  public void setCar(Car car, int index) {
    this.cars.set(index, new Car(car));
  }

  public void addCar(Car car) {
    this.cars.add(car);
  }
}