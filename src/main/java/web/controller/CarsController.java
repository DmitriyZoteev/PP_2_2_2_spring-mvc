package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.carService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private carService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi A6", 356, 2.9));
        cars.add(new Car("BMW M2", 675, 2.9));
        cars.add(new Car("Toyota Camry", 345, 2));
        cars.add(new Car("Kia Rio", 923, 1.6));
        cars.add(new Car("Nissan Patrol", 143, 5.6));
        model.addAttribute("carsList", carService.getAmountCars(cars, count));
        return "cars";
    }
}
