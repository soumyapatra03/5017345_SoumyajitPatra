package com.soumyadeep.bookstore.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class CustomerResource extends RepresentationModel<CustomerResource> {
    private Long id;
    private String name;
    private String email;
    private String address;

    // Getters and setters

    public CustomerResource(Long id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;

        // Add self-link
        this.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CustomerController.class).getCustomerById(id)).withSelfRel());
    }
}
