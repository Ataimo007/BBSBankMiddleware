package com.qucoon.banktransaction.ext_services;

import com.qucoon.banktransaction.model.*;
import com.qucoon.banktransaction.wsdl.AddPaymentLocal;
import com.qucoon.banktransaction.wsdl.AddPaymentLocalResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import com.qucoon.banktransaction.wsdl.GetAccountBalance;

public class BankTransactionClient extends WebServiceGatewaySupport
{
    private static final Logger log = LoggerFactory.getLogger(BankTransactionClient.class);

    public LocalPaymentResponse addLocalPayment(LocalPayment payment)
    {
        log.info("Processing the following transaction JSON " + payment);

        AddPaymentLocal localPaymentInSoap = getLocalPaymentInSoap(payment);
        log.info("Processing the following transaction SOAP " + localPaymentInSoap);

        AddPaymentLocalResponse addPaymentLocalResponse = (AddPaymentLocalResponse) getWebServiceTemplate()
                .marshalSendAndReceive(localPaymentInSoap, new SoapActionCallback("http://qucoon.com/AddPaymentLocal"));

        return getPaymentResponse(addPaymentLocalResponse);
    }

    private LocalPaymentResponse getPaymentResponse(AddPaymentLocalResponse localResponse)
    {
        AddPaymentLocalResponse.AddPaymentLocalResult response = localResponse.getAddPaymentLocalResult();
        return new LocalPaymentResponse(new AddPaymentLocalResult(response.getCorporateCode(), response.getBatchReference(), response.getAccountNo(),
                String.valueOf(response.getStatusCode()), response.getStatusDescription() ));
    }

    private AddPaymentLocal getLocalPaymentInSoap(LocalPayment payment)
    {
        AddPaymentLocal addPaymentLocal = new AddPaymentLocal();
        AddPaymentLocal.Dto dto = new AddPaymentLocal.Dto();
        List<AddPaymentLocal.Dto.PaymentTransactions> transactions = payment.getDto().getPaymentTransactions().stream().map(paymentTransaction -> {
            AddPaymentLocal.Dto.PaymentTransactions.PaymentTransactionLocal paymentSoap = new AddPaymentLocal.Dto.PaymentTransactions.PaymentTransactionLocal();
            paymentSoap.setAmount(Integer.valueOf(paymentTransaction.getAmount()));
            paymentSoap.setAccountNumber(paymentTransaction.getAccountNumber());
            paymentSoap.setBeneficiary(paymentTransaction.getBeneficiary());
            if (!paymentTransaction.getBeneficiaryEmail().isEmpty())
                paymentSoap.setBeneficiaryEmail((String) paymentTransaction.getBeneficiaryEmail().get(0));
            if (!paymentTransaction.getBeneficiaryPhone().isEmpty())
                paymentSoap.setBeneficiaryPhone((String) paymentTransaction.getBeneficiaryPhone().get(0));
            paymentSoap.setDestinationBankCode(Short.valueOf(paymentTransaction.getDestinationBankCode()));
            paymentSoap.setTransactionReference(paymentTransaction.getTransactionReference());
            paymentSoap.setNaration(paymentTransaction.getNaration());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            try {
                gregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(paymentTransaction.getValueDate()));
                paymentSoap.setValueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar));
            } catch (ParseException | DatatypeConfigurationException e) {
                e.printStackTrace();
            }
            AddPaymentLocal.Dto.PaymentTransactions paymentTransactions = new AddPaymentLocal.Dto.PaymentTransactions();
            paymentTransactions.setPaymentTransactionLocal(paymentSoap);
            return paymentTransactions;
        }).toList();
        dto.getPaymentTransactions().addAll(transactions);
        dto.setAmount(Integer.valueOf(payment.getDto().getAmount()));
        dto.setBatchReference(payment.getDto().getBatchReference());
        dto.setCorporateCode(payment.getDto().getCorporateCode());
        dto.setCurrency(payment.getDto().getCurrency());
        dto.setPassword(payment.getDto().getPassword());
        dto.setEnableSingleDebit(Short.valueOf(payment.getDto().getEnableSingleDebit()));
        dto.setPaymentMethodId(Short.valueOf(payment.getDto().getPaymentMethodId()));
        dto.setUsername(payment.getDto().getUsername());
        dto.setTotalTransactions(Short.valueOf(payment.getDto().getTotalTransactions()));
        dto.setSourceAccount(payment.getDto().getSourceAccount());
        dto.setSourceAccount(payment.getDto().getSourceAccount());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(payment.getDto().getDate()));
            dto.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar));
        } catch (ParseException | DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        addPaymentLocal.setDto(dto);
        return addPaymentLocal;
    }

    public GetAccountBalanceResponse getAccountBalance(com.qucoon.banktransaction.model.GetAccountBalance accountDetails)
    {
        log.info("Processing the following transaction JSON " + accountDetails);

        com.qucoon.banktransaction.wsdl.GetAccountBalance balanceSoap = getAccountBalanceInSoap(accountDetails);
        log.info("Processing the following transaction SOAP " + balanceSoap);

        com.qucoon.banktransaction.wsdl.GetAccountBalanceResponse getAccountBalanceResponse =
                (com.qucoon.banktransaction.wsdl.GetAccountBalanceResponse) getWebServiceTemplate()
                .marshalSendAndReceive(balanceSoap, new SoapActionCallback("http://qucoon.com/GetAccountBalance"));

        return getAccountBalanceResponse(getAccountBalanceResponse);
    }

    private com.qucoon.banktransaction.model.GetAccountBalanceResponse getAccountBalanceResponse(
            com.qucoon.banktransaction.wsdl.GetAccountBalanceResponse balance )
    {
        com.qucoon.banktransaction.wsdl.GetAccountBalanceResponse.GetAccountBalanceResult result = balance.getGetAccountBalanceResult();
        return new com.qucoon.banktransaction.model.GetAccountBalanceResponse(
                new GetAccountBalanceResult(result.getCorporateCode(), result.getAccountNumber(), result.getBalance().toString(),
                        String.valueOf(result.getStatusCode()), result.getStatusDescription() ) );
    }

    private com.qucoon.banktransaction.wsdl.GetAccountBalance getAccountBalanceInSoap(com.qucoon.banktransaction.model.GetAccountBalance accountDetails) {
        com.qucoon.banktransaction.wsdl.GetAccountBalance balance = new com.qucoon.banktransaction.wsdl.GetAccountBalance();
        GetAccountBalance.Request request = new GetAccountBalance.Request();
        request.setAccountNumber(accountDetails.getRequest().getAccountNumber());
        request.setCorporateCode(accountDetails.getRequest().getCorporateCode());
        balance.setRequest(request);
        return balance;
    }
}
