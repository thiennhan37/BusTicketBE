package com.example.BusTicket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
public class CompanyUser {
    @Id
    private String id;
    private String busCompanyID, email, phone, password, fullName;
    private LocalDate dob;
    private String gender, role, status;

}
