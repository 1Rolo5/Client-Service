package com.service.clientservice.dto.client;

import com.service.clientservice.model.Bank_Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor

public class PersonnelDto{

    private String idPersonal;
    private String dni;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String passport;
    private List<Bank_Account> accounts;


}
