package com.spencerstewart.ezbank.accounts.controller;

import com.spencerstewart.ezbank.accounts.constants.AccountConstant;
import com.spencerstewart.ezbank.accounts.dto.CustomerDto;
import com.spencerstewart.ezbank.accounts.dto.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountConstant.STATUS_201, AccountConstant.MESSAGE_201));
    }
}
