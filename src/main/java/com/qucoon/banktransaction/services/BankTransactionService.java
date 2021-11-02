package com.qucoon.banktransaction.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.google.gson.Gson;
import com.qucoon.banktransaction.ext_services.BankTransactionClient;
import com.qucoon.banktransaction.model.GetAccountBalance;
import com.qucoon.banktransaction.model.GetAccountBalanceResponse;
import com.qucoon.banktransaction.model.LocalPayment;
import com.qucoon.banktransaction.model.LocalPaymentResponse;
import com.qucoon.banktransaction.wsdl.AddPaymentLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

@Service
public class BankTransactionService {

    private final BankTransactionClient bankTransactionClient;

    @Autowired
    public BankTransactionService(BankTransactionClient bankTransactionClient) {
        this.bankTransactionClient = bankTransactionClient;
    }

    public LocalPaymentResponse addPayment(LocalPayment transaction) {
        return bankTransactionClient.addLocalPayment(transaction);
    }
    public GetAccountBalanceResponse getBalance(GetAccountBalance accountDetails) {
        return bankTransactionClient.getAccountBalance(accountDetails);
    }
}
