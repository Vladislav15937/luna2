package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.servise.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.awt.*;
import java.util.List;

@Controller
public class CarController {

    CarService carService;

    CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(Model model, @RequestParam(defaultValue = "5") Integer id) {
        List<Car> ca = carService.getCarCount(id);
        model.addAttribute("spisokmashin", ca);
        return "/cars";
    }

}
