package com.example.student.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//By default, Table name is same as entity class name.
public class Student {
    //Declaring primary-key and type is auto-generate.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    Integer marks;
}
