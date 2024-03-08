package dev.cyan.autoRiaClone.service;

import dev.cyan.autoRiaClone.entity.Car;
import dev.cyan.autoRiaClone.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Optional<Car> findById(String id) {
        return carRepository.findById(id);
    }

    public Car create(Car car) {
        return carRepository.save(car);
    }

    //TODO коли з'явиться DTO - потрібно переписати
    public Car updateById(String id, Car car) {
        carRepository.findById(id).orElseThrow();

        // carMapper.update(target, source);

        return carRepository.save(car);
    }

    //TODO коли з'явиться DTO - потрібно переписати
    public Car patchById(String id, Car car) {
        carRepository.findById(id).orElseThrow();

        // carMapper.patch(target, source);

        return carRepository.save(car);
    }

    public void deleteById(String id) {
        carRepository.deleteById(id);
    }
}
