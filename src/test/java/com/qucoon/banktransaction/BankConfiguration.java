package com.qucoon.banktransaction;

import com.qucoon.banktransaction.ext_services.BankTransactionClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.annotation.PostConstruct;

@Configuration
public class BankConfiguration {

    @Bean
    @PostConstruct
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.qucoon.banktransaction.wsdl");
        return marshaller;
    }

    @Bean
    public BankTransactionClient getBankTransactions(Jaxb2Marshaller marshaller) {
        BankTransactionClient client = new BankTransactionClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
