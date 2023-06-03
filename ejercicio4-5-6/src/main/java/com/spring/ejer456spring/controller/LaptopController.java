package com.spring.ejer456spring.controller;

import com.spring.ejer456spring.entity.laptop;
import com.spring.ejer456spring.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public class LaptopController {
    private final LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository=laptopRepository;
    }
    @GetMapping("/api/laptops")
    public List<LaptopRepository> findAll(){
        return laptopRepository.findAll();
    }
    @PostMapping("/api/save")
    public laptop save(@RequestBody laptop laptop){
        return laptopRepository.save(laptop);
    }
}
