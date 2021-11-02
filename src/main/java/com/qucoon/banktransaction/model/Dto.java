
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
    "PaymentTransactions",
    "CorporateCode",
    "Currency",
    "SingleDebitNaration",
    "EnableSingleDebit",
    "Date",
    "TotalTransactions",
    "SourceAccount",
    "Amount",
    "PaymentMethodId",
    "PaymentTypeId",
    "BatchReference",
    "Username",
    "Password"
})
@Generated("jsonschema2pojo")
public class Dto {

    @JsonProperty("PaymentTransactions")
    @Valid
    private List<PaymentTransaction> paymentTransactions = null;
    @JsonProperty("CorporateCode")
    private String corporateCode;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("SingleDebitNaration")
    @Valid
    private List<Object> singleDebitNaration = null;
    @JsonProperty("EnableSingleDebit")
    private String enableSingleDebit;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("TotalTransactions")
    private String totalTransactions;
    @JsonProperty("SourceAccount")
    private String sourceAccount;
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;
    @JsonProperty("PaymentTypeId")
    private String paymentTypeId;
    @JsonProperty("BatchReference")
    private String batchReference;
    @JsonProperty("Username")
    private String username;
    @JsonProperty("Password")
    private String password;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dto() {
    }

    /**
     * 
     * @param date
     * @param totalTransactions
     * @param amount
     * @param paymentTransactions
     * @param singleDebitNaration
     * @param sourceAccount
     * @param enableSingleDebit
     * @param corporateCode
     * @param batchReference
     * @param password
     * @param paymentTypeId
     * @param paymentMethodId
     * @param currency
     * @param username
     */
    public Dto(List<PaymentTransaction> paymentTransactions, String corporateCode, String currency, List<Object> singleDebitNaration, String enableSingleDebit, String date, String totalTransactions, String sourceAccount, String amount, String paymentMethodId, String paymentTypeId, String batchReference, String username, String password) {
        super();
        this.paymentTransactions = paymentTransactions;
        this.corporateCode = corporateCode;
        this.currency = currency;
        this.singleDebitNaration = singleDebitNaration;
        this.enableSingleDebit = enableSingleDebit;
        this.date = date;
        this.totalTransactions = totalTransactions;
        this.sourceAccount = sourceAccount;
        this.amount = amount;
        this.paymentMethodId = paymentMethodId;
        this.paymentTypeId = paymentTypeId;
        this.batchReference = batchReference;
        this.username = username;
        this.password = password;
    }

    @JsonProperty("PaymentTransactions")
    public List<PaymentTransaction> getPaymentTransactions() {
        return paymentTransactions;
    }

    @JsonProperty("PaymentTransactions")
    public void setPaymentTransactions(List<PaymentTransaction> paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
    }

    public Dto withPaymentTransactions(List<PaymentTransaction> paymentTransactions) {
        this.paymentTransactions = paymentTransactions;
        return this;
    }

    @JsonProperty("CorporateCode")
    public String getCorporateCode() {
        return corporateCode;
    }

    @JsonProperty("CorporateCode")
    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public Dto withCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
        return this;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Dto withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("SingleDebitNaration")
    public List<Object> getSingleDebitNaration() {
        return singleDebitNaration;
    }

    @JsonProperty("SingleDebitNaration")
    public void setSingleDebitNaration(List<Object> singleDebitNaration) {
        this.singleDebitNaration = singleDebitNaration;
    }

    public Dto withSingleDebitNaration(List<Object> singleDebitNaration) {
        this.singleDebitNaration = singleDebitNaration;
        return this;
    }

    @JsonProperty("EnableSingleDebit")
    public String getEnableSingleDebit() {
        return enableSingleDebit;
    }

    @JsonProperty("EnableSingleDebit")
    public void setEnableSingleDebit(String enableSingleDebit) {
        this.enableSingleDebit = enableSingleDebit;
    }

    public Dto withEnableSingleDebit(String enableSingleDebit) {
        this.enableSingleDebit = enableSingleDebit;
        return this;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    public Dto withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("TotalTransactions")
    public String getTotalTransactions() {
        return totalTransactions;
    }

    @JsonProperty("TotalTransactions")
    public void setTotalTransactions(String totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    public Dto withTotalTransactions(String totalTransactions) {
        this.totalTransactions = totalTransactions;
        return this;
    }

    @JsonProperty("SourceAccount")
    public String getSourceAccount() {
        return sourceAccount;
    }

    @JsonProperty("SourceAccount")
    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Dto withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
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

    public Dto withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("PaymentMethodId")
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    @JsonProperty("PaymentMethodId")
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Dto withPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
        return this;
    }

    @JsonProperty("PaymentTypeId")
    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    @JsonProperty("PaymentTypeId")
    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Dto withPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
        return this;
    }

    @JsonProperty("BatchReference")
    public String getBatchReference() {
        return batchReference;
    }

    @JsonProperty("BatchReference")
    public void setBatchReference(String batchReference) {
        this.batchReference = batchReference;
    }

    public Dto withBatchReference(String batchReference) {
        this.batchReference = batchReference;
        return this;
    }

    @JsonProperty("Username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("Username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Dto withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
    }

    public Dto withPassword(String password) {
        this.password = password;
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

    public Dto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentTransactions");
        sb.append('=');
        sb.append(((this.paymentTransactions == null)?"<null>":this.paymentTransactions));
        sb.append(',');
        sb.append("corporateCode");
        sb.append('=');
        sb.append(((this.corporateCode == null)?"<null>":this.corporateCode));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("singleDebitNaration");
        sb.append('=');
        sb.append(((this.singleDebitNaration == null)?"<null>":this.singleDebitNaration));
        sb.append(',');
        sb.append("enableSingleDebit");
        sb.append('=');
        sb.append(((this.enableSingleDebit == null)?"<null>":this.enableSingleDebit));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("totalTransactions");
        sb.append('=');
        sb.append(((this.totalTransactions == null)?"<null>":this.totalTransactions));
        sb.append(',');
        sb.append("sourceAccount");
        sb.append('=');
        sb.append(((this.sourceAccount == null)?"<null>":this.sourceAccount));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("paymentMethodId");
        sb.append('=');
        sb.append(((this.paymentMethodId == null)?"<null>":this.paymentMethodId));
        sb.append(',');
        sb.append("paymentTypeId");
        sb.append('=');
        sb.append(((this.paymentTypeId == null)?"<null>":this.paymentTypeId));
        sb.append(',');
        sb.append("batchReference");
        sb.append('=');
        sb.append(((this.batchReference == null)?"<null>":this.batchReference));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.totalTransactions == null)? 0 :this.totalTransactions.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.paymentTransactions == null)? 0 :this.paymentTransactions.hashCode()));
        result = ((result* 31)+((this.singleDebitNaration == null)? 0 :this.singleDebitNaration.hashCode()));
        result = ((result* 31)+((this.sourceAccount == null)? 0 :this.sourceAccount.hashCode()));
        result = ((result* 31)+((this.enableSingleDebit == null)? 0 :this.enableSingleDebit.hashCode()));
        result = ((result* 31)+((this.corporateCode == null)? 0 :this.corporateCode.hashCode()));
        result = ((result* 31)+((this.batchReference == null)? 0 :this.batchReference.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.paymentTypeId == null)? 0 :this.paymentTypeId.hashCode()));
        result = ((result* 31)+((this.paymentMethodId == null)? 0 :this.paymentMethodId.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dto) == false) {
            return false;
        }
        Dto rhs = ((Dto) other);
        return ((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.totalTransactions == rhs.totalTransactions)||((this.totalTransactions!= null)&&this.totalTransactions.equals(rhs.totalTransactions))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.paymentTransactions == rhs.paymentTransactions)||((this.paymentTransactions!= null)&&this.paymentTransactions.equals(rhs.paymentTransactions))))&&((this.singleDebitNaration == rhs.singleDebitNaration)||((this.singleDebitNaration!= null)&&this.singleDebitNaration.equals(rhs.singleDebitNaration))))&&((this.sourceAccount == rhs.sourceAccount)||((this.sourceAccount!= null)&&this.sourceAccount.equals(rhs.sourceAccount))))&&((this.enableSingleDebit == rhs.enableSingleDebit)||((this.enableSingleDebit!= null)&&this.enableSingleDebit.equals(rhs.enableSingleDebit))))&&((this.corporateCode == rhs.corporateCode)||((this.corporateCode!= null)&&this.corporateCode.equals(rhs.corporateCode))))&&((this.batchReference == rhs.batchReference)||((this.batchReference!= null)&&this.batchReference.equals(rhs.batchReference))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.paymentTypeId == rhs.paymentTypeId)||((this.paymentTypeId!= null)&&this.paymentTypeId.equals(rhs.paymentTypeId))))&&((this.paymentMethodId == rhs.paymentMethodId)||((this.paymentMethodId!= null)&&this.paymentMethodId.equals(rhs.paymentMethodId))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
