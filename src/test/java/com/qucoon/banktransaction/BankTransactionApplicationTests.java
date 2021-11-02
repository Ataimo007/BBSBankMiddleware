package com.qucoon.banktransaction;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@SpringBootTest
@AutoConfigureMockMvc
class BankTransactionApplicationTests {

	@Autowired
	private MockMvc mockMvc;

//	@MockBean
//	private GreetingService service;

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {

		MockHttpServletRequestBuilder test = put("/addPayment").content("{\n" +
				"   \"dto\": {\n" +
				"      \"PaymentTransactions\": [\n" +
				"         {\n" +
				"            \"DestinationBankCode\": \"044\",\n" +
				"            \"Beneficiary\": \"TEST USER\",\n" +
				"            \"AccountNumber\": \"00000XXXXX\",\n" +
				"            \"Amount\": \"1100\",\n" +
				"            \"Naration\": \"ERP TEST2\",\n" +
				"            \"ValueDate\": \"2018-08-03\",\n" +
				"            \"TransactionReference\": \"TEST1234\",\n" +
				"            \"BeneficiaryEmail\": [],\n" +
				"            \"BeneficiaryPhone\": []\n" +
				"         }\n" +
				"      ],\n" +
				"      \"CorporateCode\": \"XXX\",\n" +
				"      \"Currency\": \"NGN\",\n" +
				"      \"SingleDebitNaration\": [],\n" +
				"      \"EnableSingleDebit\": \"0\",\n" +
				"      \"Date\": \"2018-08-03\",\n" +
				"      \"TotalTransactions\": \"1\",\n" +
				"      \"SourceAccount\": \"00000XXXXX\",\n" +
				"      \"Amount\": \"1100\",\n" +
				"      \"PaymentMethodId\": \"1\",\n" +
				"      \"PaymentTypeId\": \"1\",\n" +
				"      \"BatchReference\": \"BATCHTest1100\",\n" +
				"      \"Username\": \"XXX\",\n" +
				"      \"Password\": \"XXXX\"\n" +
				"   }\n" +
				"}");
		this.mockMvc.perform(test).andDo(print());

//		this.mockMvc.perform(test).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("Hello, Mock")));

//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
//				String.class)).contains("Hello, World");
	}

}
