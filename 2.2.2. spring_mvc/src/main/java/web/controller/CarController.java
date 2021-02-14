package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carDAO) {
        this.carService = carDAO;
    }

    @GetMapping()
    public String cars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        if (number == null) {
            number = 6;
        }
        model.addAttribute("cars", carService.cars(number));
        return "cars";
    }


}
