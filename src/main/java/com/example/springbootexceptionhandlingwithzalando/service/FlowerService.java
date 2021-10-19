package com.example.springbootexceptionhandlingwithzalando.service;

import com.example.springbootexceptionhandlingwithzalando.dto.FlowerRequestDTO;
import com.example.springbootexceptionhandlingwithzalando.model.Flower;

import java.util.Date;
import java.util.List;

public interface FlowerService {

    Flower toStitch(FlowerRequestDTO flowerRequestDTO);

    Flower takeCareFlower(int id);

    Flower getFlower(int id) ;

    List<Flower> getFlowers();

    void snatchFlower(int id);
}
