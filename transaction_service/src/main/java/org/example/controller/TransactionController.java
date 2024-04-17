package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.UserTransactionRequest;
import org.example.dto.UserTransactionResponse;
import org.example.entity.Transaction;
import org.example.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
@Slf4j
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<UserTransactionResponse> createTransactionRequest(@RequestBody UserTransactionRequest request) throws JsonProcessingException {
        return new ResponseEntity<>(transactionService.createTransactionRequest(request), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public String getTransactionDetails(@PathVariable("id") String id){
        return transactionService.getTransactionDetailsById(id);
    }
}
