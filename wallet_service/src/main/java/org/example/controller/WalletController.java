package org.example.controller;

import org.example.dto.RechargeRequestDto;
import org.example.service.WalletOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet-ops")
public class WalletController {

    @Autowired
    private WalletOperations walletOperations;

    @GetMapping("/fetchBalance/{id}")
    public ResponseEntity<Double> getBalance(@PathVariable("id") Long userId) {
        return new ResponseEntity<>(walletOperations.fetchBalance(userId), HttpStatus.OK);
    }

    @PostMapping("/recharge")
    public void recharge(@RequestBody RechargeRequestDto rechargeRequestDto){
        try {
            walletOperations.rechargeWallet(rechargeRequestDto);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
