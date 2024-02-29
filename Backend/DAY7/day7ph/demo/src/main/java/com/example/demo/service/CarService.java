package com.example.demo.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
    public CarRepo carRepo;
    public CarService(CarRepo carRepo)
    {
        this.carRepo = carRepo;
    }
    public boolean saveCar(Car car)
    {
        try
        {
            carRepo.save(car);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Car> getCars()
    {
        return carRepo.findAll();
    }
    public List<Car> getFiltered(String currentOwnerName,String address)
    {
        return carRepo.findDistinctByCurrentOwnerNameAndAddress(currentOwnerName, address);
    }
}
