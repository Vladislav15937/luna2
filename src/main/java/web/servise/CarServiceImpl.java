package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getCarCount(Integer id) {

        List<Car> spisok;
        spisok = new ArrayList<>();
        spisok.add(new Car("Audi", 1, 1));
        spisok.add(new Car("Mercedes", 2, 2));
        spisok.add(new Car("Honda", 3, 3));
        spisok.add(new Car("Tesla", 4, 4));
        spisok.add(new Car("Toyota", 5, 5));

        return spisok.stream().limit(id).collect(Collectors.toList());
    }
}
