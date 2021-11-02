
package com.qucoon.banktransaction.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationBankCode",
    "Beneficiary",
    "AccountNumber",
    "Amount",
    "Naration",
    "ValueDate",
    "TransactionReference",
    "BeneficiaryEmail",
    "BeneficiaryPhone"
})
@Generated("jsonschema2pojo")
public class PaymentTransaction {

    @JsonProperty("DestinationBankCode")
    private String destinationBankCode;
    @JsonProperty("Beneficiary")
    private String beneficiary;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("Naration")
    private String naration;
    @JsonProperty("ValueDate")
    private String valueDate;
    @JsonProperty("TransactionReference")
    private String transactionReference;
    @JsonProperty("BeneficiaryEmail")
    @Valid
    private List<Object> beneficiaryEmail = null;
    @JsonProperty("BeneficiaryPhone")
    @Valid
    private List<Object> beneficiaryPhone = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentTransaction() {
    }

    /**
     * 
     * @param amount
     * @param beneficiaryEmail
     * @param destinationBankCode
     * @param beneficiary
     * @param naration
     * @param transactionReference
     * @param beneficiaryPhone
     * @param valueDate
     * @param accountNumber
     */
    public PaymentTransaction(String destinationBankCode, String beneficiary, String accountNumber, String amount, String naration, String valueDate, String transactionReference, List<Object> beneficiaryEmail, List<Object> beneficiaryPhone) {
        super();
        this.destinationBankCode = destinationBankCode;
        this.beneficiary = beneficiary;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.naration = naration;
        this.valueDate = valueDate;
        this.transactionReference = transactionReference;
        this.beneficiaryEmail = beneficiaryEmail;
        this.beneficiaryPhone = beneficiaryPhone;
    }

    @JsonProperty("DestinationBankCode")
    public String getDestinationBankCode() {
        return destinationBankCode;
    }

    @JsonProperty("DestinationBankCode")
    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
    }

    public PaymentTransaction withDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
        return this;
    }

    @JsonProperty("Beneficiary")
    public String getBeneficiary() {
        return beneficiary;
    }

    @JsonProperty("Beneficiary")
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public PaymentTransaction withBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public PaymentTransaction withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @JsonProperty("Amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PaymentTransaction withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("Naration")
    public String getNaration() {
        return naration;
    }

    @JsonProperty("Naration")
    public void setNaration(String naration) {
        this.naration = naration;
    }

    public PaymentTransaction withNaration(String naration) {
        this.naration = naration;
        return this;
    }

    @JsonProperty("ValueDate")
    public String getValueDate() {
        return valueDate;
    }

    @JsonProperty("ValueDate")
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public PaymentTransaction withValueDate(String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

    @JsonProperty("TransactionReference")
    public String getTransactionReference() {
        return transactionReference;
    }

    @JsonProperty("TransactionReference")
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public PaymentTransaction withTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    @JsonProperty("BeneficiaryEmail")
    public List<Object> getBeneficiaryEmail() {
        return beneficiaryEmail;
    }

    @JsonProperty("BeneficiaryEmail")
    public void setBeneficiaryEmail(List<Object> beneficiaryEmail) {
        this.beneficiaryEmail = beneficiaryEmail;
    }

    public PaymentTransaction withBeneficiaryEmail(List<Object> beneficiaryEmail) {
        this.beneficiaryEmail = beneficiaryEmail;
        return this;
    }

    @JsonProperty("BeneficiaryPhone")
    public List<Object> getBeneficiaryPhone() {
        return beneficiaryPhone;
    }

    @JsonProperty("BeneficiaryPhone")
    public void setBeneficiaryPhone(List<Object> beneficiaryPhone) {
        this.beneficiaryPhone = beneficiaryPhone;
    }

    public PaymentTransaction withBeneficiaryPhone(List<Object> beneficiaryPhone) {
        this.beneficiaryPhone = beneficiaryPhone;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PaymentTransaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentTransaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinationBankCode");
        sb.append('=');
        sb.append(((this.destinationBankCode == null)?"<null>":this.destinationBankCode));
        sb.append(',');
        sb.append("beneficiary");
        sb.append('=');
        sb.append(((this.beneficiary == null)?"<null>":this.beneficiary));
        sb.append(',');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("naration");
        sb.append('=');
        sb.append(((this.naration == null)?"<null>":this.naration));
        sb.append(',');
        sb.append("valueDate");
        sb.append('=');
        sb.append(((this.valueDate == null)?"<null>":this.valueDate));
        sb.append(',');
        sb.append("transactionReference");
        sb.append('=');
        sb.append(((this.transactionReference == null)?"<null>":this.transactionReference));
        sb.append(',');
        sb.append("beneficiaryEmail");
        sb.append('=');
        sb.append(((this.beneficiaryEmail == null)?"<null>":this.beneficiaryEmail));
        sb.append(',');
        sb.append("beneficiaryPhone");
        sb.append('=');
        sb.append(((this.beneficiaryPhone == null)?"<null>":this.beneficiaryPhone));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.beneficiaryEmail == null)? 0 :this.beneficiaryEmail.hashCode()));
        result = ((result* 31)+((this.destinationBankCode == null)? 0 :this.destinationBankCode.hashCode()));
        result = ((result* 31)+((this.beneficiary == null)? 0 :this.beneficiary.hashCode()));
        result = ((result* 31)+((this.naration == null)? 0 :this.naration.hashCode()));
        result = ((result* 31)+((this.transactionReference == null)? 0 :this.transactionReference.hashCode()));
        result = ((result* 31)+((this.beneficiaryPhone == null)? 0 :this.beneficiaryPhone.hashCode()));
        result = ((result* 31)+((this.valueDate == null)? 0 :this.valueDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountNumber == null)? 0 :this.accountNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentTransaction) == false) {
            return false;
        }
        PaymentTransaction rhs = ((PaymentTransaction) other);
        return (((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.beneficiaryEmail == rhs.beneficiaryEmail)||((this.beneficiaryEmail!= null)&&this.beneficiaryEmail.equals(rhs.beneficiaryEmail))))&&((this.destinationBankCode == rhs.destinationBankCode)||((this.destinationBankCode!= null)&&this.destinationBankCode.equals(rhs.destinationBankCode))))&&((this.beneficiary == rhs.beneficiary)||((this.beneficiary!= null)&&this.beneficiary.equals(rhs.beneficiary))))&&((this.naration == rhs.naration)||((this.naration!= null)&&this.naration.equals(rhs.naration))))&&((this.transactionReference == rhs.transactionReference)||((this.transactionReference!= null)&&this.transactionReference.equals(rhs.transactionReference))))&&((this.beneficiaryPhone == rhs.beneficiaryPhone)||((this.beneficiaryPhone!= null)&&this.beneficiaryPhone.equals(rhs.beneficiaryPhone))))&&((this.valueDate == rhs.valueDate)||((this.valueDate!= null)&&this.valueDate.equals(rhs.valueDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountNumber == rhs.accountNumber)||((this.accountNumber!= null)&&this.accountNumber.equals(rhs.accountNumber))));
    }

}
