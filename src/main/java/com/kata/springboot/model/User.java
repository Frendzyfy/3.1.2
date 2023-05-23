package com.kata.springboot.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 15, message = "Name should be between 2 and 15 characters")
    @Column(name="name")
    private String name;

    @NotEmpty(message = "Surname should not be empty")
    @Size(min = 2, max = 25, message = "Surname should be between 2 and 25 characters")
    @Column(name="surname")
    private String surname;

    @Size(min = 2, max = 20, message = "Department should be between 2 and 20 characters")
    @Column(name = "department")
    private String department;

    @Min(value = 0, message = "Salary should be greater then 0")
    @Column(name = "salary")
    private int salary;
}

