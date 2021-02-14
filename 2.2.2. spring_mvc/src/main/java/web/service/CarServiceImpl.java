package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("KIA", 5, "black"));
        cars.add(new Car("BMW", 3, "white"));
        cars.add(new Car("LADA", 7, "purple"));
        cars.add(new Car("CHEVROLET", 2, "pink"));
        cars.add(new Car("HONDA", 1, "red"));
        cars.add(new Car("MAZDA", 4, "yellow"));
        cars.add(new Car("NISSAN", 9, "grey"));
        cars.add(new Car("TOYOTA", 11, "blue"));
    }

    @Override
    public List<Car> cars(Integer number) {
        if ((number > 0) && (number < 5)) {
            return cars.stream().limit(number).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
