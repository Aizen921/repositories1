package com.repositories1.repositories1.controllers;

import com.repositories1.repositories1.DAO.CarDAO;
import com.repositories1.repositories1.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarDAO carDAO;

    @PostMapping("/")
    public Car createCar(@RequestBody Car car){
        Car newCar = carDAO.save(car);
        return newCar;
    }
    @GetMapping("/list")
    public List<Car> GetCarList(){
        List<Car> carList = carDAO.findAll();
        return carList;
    }
}
