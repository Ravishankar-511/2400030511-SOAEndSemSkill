
package com.example.touristmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.service.TouristService;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public List<Tourist> getAllTourists() {
        return touristService.getAllTourists();
    }
}
