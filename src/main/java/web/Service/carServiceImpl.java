package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.carDao;
import web.Model.Car;

import java.util.List;
@Service
public class carServiceImpl implements carService {

    @Autowired
    private carDao carDao;

    @Override
    public List<Car> getAmountCars(List<Car> carList, int count) {
        return carDao.getAmountCars(carList, count);
    }
}
