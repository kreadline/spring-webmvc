package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "vaz", 123));
        cars.add(new Car(2, "nevaz", 321));
        cars.add(new Car(3, "autovaz", 456));
        cars.add(new Car(4, "minivaz", 654));
        cars.add(new Car(5, "microvaz", 789));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}
