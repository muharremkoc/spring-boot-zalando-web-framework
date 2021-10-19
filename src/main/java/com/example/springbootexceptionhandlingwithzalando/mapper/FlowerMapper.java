package com.example.springbootexceptionhandlingwithzalando.mapper;

import com.example.springbootexceptionhandlingwithzalando.dto.FlowerRequestDTO;
import com.example.springbootexceptionhandlingwithzalando.model.Flower;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface FlowerMapper {


    @Mappings({
            @Mapping(target = "name",source = "name"),
            @Mapping(target = "color",source = "color"),
            @Mapping(target = "leaf",source = "leaf")
    })
    Flower flowerRequestDTOToFlower(FlowerRequestDTO flowerRequestDTO);

}
