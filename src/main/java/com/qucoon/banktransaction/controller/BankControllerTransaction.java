package com.qucoon.banktransaction.controller;

import com.qucoon.banktransaction.ext_services.BankTransactionClient;
import com.qucoon.banktransaction.model.GetAccountBalance;
import com.qucoon.banktransaction.model.GetAccountBalanceResponse;
import com.qucoon.banktransaction.model.LocalPayment;
import com.qucoon.banktransaction.model.LocalPaymentResponse;
import com.qucoon.banktransaction.services.BankTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1")
public class BankControllerTransaction
{
    private final BankTransactionService bankTransactionService;

    @Autowired
    public BankControllerTransaction(BankTransactionService bankTransactionService)
    {
        this.bankTransactionService = bankTransactionService;
    }

    @PutMapping(path = "/addPayment")
    public LocalPaymentResponse addPayment(@RequestBody LocalPayment transaction)
    {
        return bankTransactionService.addPayment(transaction);
    }

    @PostMapping(path = "/getBalance")
    public GetAccountBalanceResponse getBalance(@RequestBody GetAccountBalance accountDetails)
    {
        return bankTransactionService.getBalance(accountDetails);
    }

}
