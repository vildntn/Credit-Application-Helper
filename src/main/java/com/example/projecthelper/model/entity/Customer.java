package com.example.projecthelper.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    private int id;

    private String firstName;

    private String lastName;

    private String nationalID;

    private String phoneNumber;

    private int monthlyIncome;
}
