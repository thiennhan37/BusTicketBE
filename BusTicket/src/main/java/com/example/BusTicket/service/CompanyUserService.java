package com.example.BusTicket.service;

import com.example.BusTicket.dto.response.CompanyUserResponse;
import com.example.BusTicket.entity.CompanyUser;
import com.example.BusTicket.mapper.CompanyUserMapper;
import com.example.BusTicket.repository.CompanyUserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyUserService {
    private final CompanyUserRepository companyUserRepository;
    private final CompanyUserMapper companyUserMapper;
    public List<CompanyUserResponse> getCompanyUserList(){
        return companyUserMapper.toCompanyUserResponseList(companyUserRepository.findAll());
    }
}
