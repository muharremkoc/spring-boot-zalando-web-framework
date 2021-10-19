package com.example.springbootexceptionhandlingwithzalando.exception.problems;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;
import java.util.Date;
import java.util.function.Supplier;

@JsonPropertyOrder(value = {"type","title","status","detail"})

public class FlowerNotFoundProblem extends AbstractThrowableProblem {

    private static final URI TYPE = URI.create("http://localhost:6131/garden/flower");




    public FlowerNotFoundProblem(int id) {

        super(URI.create("/"+id), "Error!!!", Status.NOT_FOUND,String.format("Flower '%s' not found", id));
    }
}
