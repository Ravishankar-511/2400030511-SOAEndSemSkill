
package com.example.touristmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.repository.TouristRepository;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<Tourist> getAllTourists() {
        return touristRepository.findAll();
    }
}
