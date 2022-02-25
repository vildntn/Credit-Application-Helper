package com.example.projecthelper.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditApplication implements Serializable {

    private int id;
    private Customer customer;
    private String creditStatus;
    private int creditLimit;
}
