package com.example.BusTicket.controller;


import com.example.BusTicket.dto.response.ApiResponse;
import com.example.BusTicket.dto.response.CompanyUserResponse;
import com.example.BusTicket.service.CompanyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nhaxe")
@RequiredArgsConstructor
public class CompanyUserController {
    private final CompanyUserService companyUserService;
    @GetMapping("/staffs")
    ApiResponse<List<CompanyUserResponse>> getAllCompanyUser(){
        return ApiResponse.success(companyUserService.getCompanyUserList());
    }
}
