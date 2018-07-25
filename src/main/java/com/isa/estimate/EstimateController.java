package com.isa.estimate;

import com.isa.accounts.Account;
import com.isa.common.ErrorResponse;
import com.isa.accounts.AccountDto;
import com.isa.accounts.AccountNotFoundException;
import com.isa.accounts.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by test on 2016-01-31.
 */
@RestController
@RequestMapping("/api/v1/")
public class EstimateController {

    @Autowired
    private EstimateService service;

    @Autowired
    private ModelMapper modelMapper;



    @RequestMapping(value="/estimate", method = RequestMethod.POST)
    public ResponseEntity createEstimate(@RequestBody @Valid EstimateDto.Create create, BindingResult result){

        if(result.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Estimate estimate = service.createEstimate(create);


        return new ResponseEntity<>(modelMapper.map(estimate, EstimateDto.Response.class), HttpStatus.OK);
    }




    @RequestMapping(value="/spoon/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id){
        service.deleteSpoon(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handlerAccountNotFoundException(AccountNotFoundException e){
        ErrorResponse errorResponse  =   new ErrorResponse();
        errorResponse.setMessage("["+ e.getId()+"]에 해당하는 계정이 없습니다.");
        errorResponse.setCode("account.not.found.exception");

        return errorResponse;
    }


    @ExceptionHandler(EstimateNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handlerSpoonNotFoundException(EstimateNotFoundException e){
        ErrorResponse errorResponse  =   new ErrorResponse();
        errorResponse.setMessage("["+ e.getId()+"]에 해당하는 기부가 없습니다.");
        errorResponse.setCode("spoon.not.found.exception");

        return errorResponse;
    }
}
