package com.example.BusTicket.mapper;

import com.example.BusTicket.dto.response.CompanyUserResponse;
import com.example.BusTicket.entity.CompanyUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-14T20:59:17+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
)
@Component
public class CompanyUserMapperImpl implements CompanyUserMapper {

    @Override
    public CompanyUserResponse toCompanyUserResponse(CompanyUser companyUser) {
        if ( companyUser == null ) {
            return null;
        }

        CompanyUserResponse.CompanyUserResponseBuilder companyUserResponse = CompanyUserResponse.builder();

        companyUserResponse.id( companyUser.getId() );
        companyUserResponse.busCompanyID( companyUser.getBusCompanyID() );
        companyUserResponse.email( companyUser.getEmail() );
        companyUserResponse.phone( companyUser.getPhone() );
        companyUserResponse.fullName( companyUser.getFullName() );
        companyUserResponse.dob( companyUser.getDob() );
        companyUserResponse.gender( companyUser.getGender() );
        companyUserResponse.role( companyUser.getRole() );
        companyUserResponse.status( companyUser.getStatus() );

        return companyUserResponse.build();
    }

    @Override
    public List<CompanyUserResponse> toCompanyUserResponseList(List<CompanyUser> companyUserList) {
        if ( companyUserList == null ) {
            return null;
        }

        List<CompanyUserResponse> list = new ArrayList<CompanyUserResponse>( companyUserList.size() );
        for ( CompanyUser companyUser : companyUserList ) {
            list.add( toCompanyUserResponse( companyUser ) );
        }

        return list;
    }
}
