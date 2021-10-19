package com.example.springbootexceptionhandlingwithzalando.repository;

import com.example.springbootexceptionhandlingwithzalando.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FlowerRepository extends JpaRepository<Flower,Integer> {



}
