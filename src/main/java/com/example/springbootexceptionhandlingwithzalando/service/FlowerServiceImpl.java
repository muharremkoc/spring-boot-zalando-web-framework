package com.example.springbootexceptionhandlingwithzalando.service;

import com.example.springbootexceptionhandlingwithzalando.dto.FlowerRequestDTO;

import com.example.springbootexceptionhandlingwithzalando.exception.problems.FlowerNotFoundProblem;
import com.example.springbootexceptionhandlingwithzalando.mapper.FlowerMapper;
import com.example.springbootexceptionhandlingwithzalando.model.Flower;
import com.example.springbootexceptionhandlingwithzalando.repository.FlowerRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class FlowerServiceImpl implements FlowerService{


    final FlowerRepository flowerRepository;

    final FlowerMapper flowerMapper;

    @Autowired
    Environment environment;






    @Override
    public Flower toStitch(FlowerRequestDTO flowerRequestDTO) {

        Flower flower=flowerMapper.flowerRequestDTOToFlower(flowerRequestDTO);


        return flowerRepository.save(flower);
    }

    @Override
    public Flower takeCareFlower(int id) {


        Flower care=flowerRepository.findById(id).orElseThrow();


        care.setLastMaintenanceDate(new Date());


            return flowerRepository.save(care);


    }

    @Override
    public Flower getFlower(int id)  {
        if (flowerRepository.findById(id).isPresent()){
            return flowerRepository.findById(id).get();

        }
        else {
            System.out.println(environment.getProperty("error.handling.codes.NotFound"));
            throw new FlowerNotFoundProblem(id);

        }
    }

    @Override
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public void snatchFlower(int id) {
        if (flowerRepository.findById(id).isPresent()){
            flowerRepository.deleteById(id);
        }
        else {
            throw new FlowerNotFoundProblem(id);
        }

    }
}
