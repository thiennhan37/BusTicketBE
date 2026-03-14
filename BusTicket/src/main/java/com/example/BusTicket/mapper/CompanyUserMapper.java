package com.example.BusTicket.mapper;

import com.example.BusTicket.dto.response.CompanyUserResponse;
import com.example.BusTicket.entity.CompanyUser;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyUserMapper {
    CompanyUserResponse toCompanyUserResponse(CompanyUser companyUser);
    List<CompanyUserResponse> toCompanyUserResponseList(List<CompanyUser> companyUserList);

}
