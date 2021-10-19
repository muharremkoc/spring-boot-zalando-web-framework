package com.example.springbootexceptionhandlingwithzalando.controller;

import com.example.springbootexceptionhandlingwithzalando.dto.FlowerRequestDTO;
import com.example.springbootexceptionhandlingwithzalando.model.Flower;
import com.example.springbootexceptionhandlingwithzalando.service.FlowerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/garden")
public class FlowerController {


    final FlowerService flowerService;

    @PostMapping(value = "/flower",
            consumes = {"application/json", "application/xml","application/x-yaml" },
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public Flower toStitch(@RequestBody FlowerRequestDTO flowerRequestDTO){

        return flowerService.toStitch(flowerRequestDTO);
    }

    @PutMapping(value = "/flower/{id}",
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public Flower takeCare(@PathVariable("id")int id){
        return flowerService.takeCareFlower(id);
    }

    @GetMapping(value = "/flower/{id}",
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public Flower getFlower(@PathVariable("id")int id){
        return flowerService.getFlower(id);
    }

    @GetMapping(value = "/flowers",
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @DeleteMapping("/flower/{id}")
    public void snatch(@PathVariable("id") int id){
        flowerService.snatchFlower(id);
    }


}
