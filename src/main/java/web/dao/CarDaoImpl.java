package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = null;

    @PostConstruct
    public void init() {
        System.out.println("Создание машин в инит блоке");
        cars = new ArrayList<>();
        cars.add(new Car("Audi A6", 356, 2.9));
        cars.add(new Car("BMW M2", 675, 2.9));
        cars.add(new Car("Toyota Camry", 345, 2));
        cars.add(new Car("Kia Rio", 923, 1.6));
        cars.add(new Car("Nissan Patrol", 143, 5.6));
    }

    @Override
    public List<Car> getAmountCars(int count) {
        return cars.size() >= count ? cars.subList(0, count) : cars;
    }
}
