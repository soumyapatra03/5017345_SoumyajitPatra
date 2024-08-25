package com.soumyadeep.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, message = "Name should not be empty")
    private String name;

    @NotNull
    @Email(message = "Email should be valid")
    private String email;

    @Size(max = 255, message = "Address should not exceed 255 characters")
    private String address;

    // Getters and setters
}
