package jsilgado.spring.openbootcampspringej789.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jsilgado.spring.openbootcampspringej789.domain.Laptop;
import jsilgado.spring.openbootcampspringej789.service.LaptopService;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public List<Laptop> findAll() {
        return laptopService.findAll();
    }

    @GetMapping("/{id}")
    public Laptop findById(@PathVariable Long id) {
        return laptopService.findById(id);
    }

    @PostMapping
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopService.create(laptop);
    }

    @PutMapping("/{id}")
    public Laptop update(@PathVariable Long id, @RequestBody Laptop laptop) {
        return laptopService.update(id, laptop);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        laptopService.delete(id);
    }
    
    @DeleteMapping
    public void deleteAll() {
        laptopService.deleteAll();
    }


}

