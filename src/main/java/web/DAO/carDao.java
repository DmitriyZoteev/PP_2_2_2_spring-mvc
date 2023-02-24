package web.DAO;

import web.Model.Car;

import java.util.List;

public interface carDao {
    public List<Car> getAmountCars(List<Car> carList, int count);
}
