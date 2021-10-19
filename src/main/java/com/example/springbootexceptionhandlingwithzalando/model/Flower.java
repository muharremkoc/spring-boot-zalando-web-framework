package com.example.springbootexceptionhandlingwithzalando.model;


import com.example.springbootexceptionhandlingwithzalando.model.data.AuditData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GeneratorType;


import javax.persistence.*;

@Entity
@Builder
@Table(name = "flowers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonPropertyOrder(value = {"id","name","color","leaf"})
public class Flower extends AuditData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String color;

    int leaf;

}
