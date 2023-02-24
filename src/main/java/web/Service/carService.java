package web.Service;

import web.Model.Car;

import java.util.List;

public interface carService {
    public List<Car> getAmountCars(List<Car> carList, int count);
}
