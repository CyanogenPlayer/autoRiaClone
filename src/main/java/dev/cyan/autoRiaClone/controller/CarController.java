package dev.cyan.autoRiaClone.controller;

import dev.cyan.autoRiaClone.entity.Car;
import dev.cyan.autoRiaClone.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getById(@PathVariable String id) {
        return ResponseEntity.of(carService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car) {
        return ResponseEntity.ok(carService.create(car));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@PathVariable String id, @RequestBody Car car) {
        return ResponseEntity.ok(carService.updateById(id, car));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Car> patch(@PathVariable String id, @RequestBody Car car) {
        return ResponseEntity.ok(carService.patchById(id, car));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        carService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
