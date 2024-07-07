package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {

        cars = new ArrayList<Car>();
        cars.add(new Car(2023, "BMW", "XM"));
        cars.add(new Car(2017, "Audi", "A6"));
        cars.add(new Car(2008, "Honda", "Civic"));
        cars.add(new Car(2024, "Skoda", "Octavia"));
        cars.add(new Car(2020, "Toyota", "Supra"));

    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }
}


