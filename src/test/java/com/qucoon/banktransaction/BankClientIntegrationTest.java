package com.qucoon.banktransaction;

import com.qucoon.banktransaction.ext_services.BankTransactionClient;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.xml.transform.StringSource;
import org.springframework.ws.test.client.MockWebServiceServer;

import javax.annotation.PostConstruct;
import javax.xml.transform.Source;

import static org.junit.Assert.assertEquals;
import static org.springframework.ws.test.client.RequestMatchers.*;
import static org.springframework.ws.test.client.ResponseCreators.*;

//import static org.assertj.core.api.Assertions.assertEquals;

//@ContextConfiguration("applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BankClientIntegrationTest {

    // MyWebServiceClient extends WebServiceGatewaySupport, and is configured in applicationContext.xml
//    @Autowired
    private BankTransactionClient client;

    private MockWebServiceServer mockServer;

    @Before
    public void createServer() throws Exception {
        BankConfiguration bankConfiguration = new BankConfiguration();
        client = bankConfiguration.getBankTransactions(bankConfiguration.marshaller());
        mockServer = MockWebServiceServer.createServer(client);
    }

    @Test
    public void getCustomerCount() throws Exception {
        Source expectedRequestPayload =
                new StringSource("<AddPaymentLocal>\n" +
                        "\t<dto>\n" +
                        "\t\t<PaymentTransactions>\n" +
                        "\t\t\t<!-- Zero or more repetitions: -->\n" +
                        "\t\t\t<PaymentTransactionLocal>\n" +
                        "\t\t\t\t<DestinationBankCode>\n" +
                        "\t\t\t\t\t044\n" +
                        "\t\t\t\t</DestinationBankCode>\n" +
                        "\t\t\t\t<Beneficiary>\n" +
                        "\t\t\t\t\tTEST USER\n" +
                        "\t\t\t\t</Beneficiary>\n" +
                        "\t\t\t\t<AccountNumber>\n" +
                        "\t\t\t\t\t00000XXXXX\n" +
                        "\t\t\t\t</AccountNumber>\n" +
                        "\t\t\t\t<Amount>\n" +
                        "\t\t\t\t\t1100\n" +
                        "\t\t\t\t</Amount>\n" +
                        "\t\t\t\t<Naration>\n" +
                        "\t\t\t\t\tERP TEST2\n" +
                        "\t\t\t\t</Naration>\n" +
                        "\t\t\t\t<ValueDate>\n" +
                        "\t\t\t\t\t2018-08-03\n" +
                        "\t\t\t\t</ValueDate>\n" +
                        "\t\t\t\t<TransactionReference>\n" +
                        "\t\t\t\t\tTEST1234\n" +
                        "\t\t\t\t</TransactionReference>\n" +
                        "\t\t\t\t<BeneficiaryEmail>\n" +
                        "\t\t\t\t</BeneficiaryEmail>\n" +
                        "\t\t\t\t<BeneficiaryPhone>\n" +
                        "\t\t\t\t</BeneficiaryPhone>\n" +
                        "\t\t\t</PaymentTransactionLocal>\n" +
                        "\t\t</PaymentTransactions>\n" +
                        "\t\t<CorporateCode>\n" +
                        "\t\t\tXXX\n" +
                        "\t\t</CorporateCode>\n" +
                        "\t\t<Currency>\n" +
                        "\t\t\tNGN\n" +
                        "\t\t</Currency>\n" +
                        "\t\t<SingleDebitNaration>\n" +
                        "\t\t</SingleDebitNaration>\n" +
                        "\t\t<EnableSingleDebit>\n" +
                        "\t\t\t0\n" +
                        "\t\t</EnableSingleDebit>\n" +
                        "\t\t<Date>\n" +
                        "\t\t\t2018-08-03\n" +
                        "\t\t</Date>\n" +
                        "\t\t<TotalTransactions>\n" +
                        "\t\t\t1\n" +
                        "\t\t</TotalTransactions>\n" +
                        "\t\t<SourceAccount>\n" +
                        "\t\t\t00000XXXXX\n" +
                        "\t\t</SourceAccount>\n" +
                        "\t\t<Amount>\n" +
                        "\t\t\t1100\n" +
                        "\t\t</Amount>\n" +
                        "\t\t<PaymentMethodId>\n" +
                        "\t\t\t1\n" +
                        "\t\t</PaymentMethodId>\n" +
                        "\t\t<PaymentTypeId>\n" +
                        "\t\t\t1\n" +
                        "\t\t</PaymentTypeId>\n" +
                        "\t\t<BatchReference>\n" +
                        "\t\t\tBATCHTest1100\n" +
                        "\t\t</BatchReference>\n" +
                        "\t\t<Username>\n" +
                        "\t\t\tXXX\n" +
                        "\t\t</Username>\n" +
                        "\t\t<Password>\n" +
                        "\t\t\tXXXX\n" +
                        "\t\t</Password>\n" +
                        "\t</dto>\n" +
                        "</AddPaymentLocal>\n");
        Source responsePayload = new StringSource("<AddPaymentLocalResponse>\n" +
                "\t<AddPaymentLocalResult>\n" +
                "\t\t<CorporateCode>\n" +
                "\t\t\tCorpXXXX\n" +
                "\t\t</CorporateCode>\n" +
                "\t\t<BatchReference>\n" +
                "\t\t\tBATCHTest1100\n" +
                "\t\t</BatchReference>\n" +
                "\t\t<AccountNo>\n" +
                "\t\t\t00000XXXXX\n" +
                "\t\t</AccountNo>\n" +
                "\t\t<StatusCode>\n" +
                "\t\t\t00\n" +
                "\t\t</StatusCode>\n" +
                "\t\t<StatusDescription>\n" +
                "\t\t\tSuccessful\n" +
                "\t\t</StatusDescription>\n" +
                "\t</AddPaymentLocalResult>\n" +
                "</AddPaymentLocalResponse>\n");

        mockServer.expect(payload(expectedRequestPayload)).andRespond(withPayload(responsePayload));

        // client.getCustomerCount() uses the WebServiceTemplate
//        int customerCount = client.getCustomerCount();
//        assertEquals(10, 10);

//        mockServer.verify();
    }

}