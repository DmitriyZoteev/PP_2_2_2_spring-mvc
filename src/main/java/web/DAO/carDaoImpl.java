package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.List;

@Repository
public class carDaoImpl implements carDao {
    @Override
    public List<Car> getAmountCars(List<Car> carList, int count) {
        return carList.size() >= count ? carList.subList(0, count) : carList;
    }
}
