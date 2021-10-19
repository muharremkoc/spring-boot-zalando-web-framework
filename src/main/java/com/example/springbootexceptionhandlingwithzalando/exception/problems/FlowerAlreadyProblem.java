package com.example.springbootexceptionhandlingwithzalando.exception.problems;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

//If you are not going to use DTO you can use this problem class
/*
@JsonPropertyOrder(value = {"type","title","status","detail"})
public class FlowerAlreadyProblem extends AbstractThrowableProblem {

    private static final URI TYPE = URI.create("http://localhost:6131/garden/flower");

    public FlowerAlreadyProblem(int id) {

        super(TYPE, "Error!!!", Status.BAD_REQUEST, String.format(" Flower '%s'  already exists", id));
    }
}

 */
