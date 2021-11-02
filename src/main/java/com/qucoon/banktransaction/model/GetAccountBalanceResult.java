
package com.qucoon.banktransaction.model;

import java.util.HashMap;
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
    "CorporateCode",
    "AccountNumber",
    "Balance",
    "StatusCode",
    "StatusDescription"
})
@Generated("jsonschema2pojo")
public class GetAccountBalanceResult {

    @JsonProperty("CorporateCode")
    private String corporateCode;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("Balance")
    private String balance;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("StatusDescription")
    private String statusDescription;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetAccountBalanceResult() {
    }

    /**
     * 
     * @param statusDescription
     * @param balance
     * @param corporateCode
     * @param accountNumber
     * @param statusCode
     */
    public GetAccountBalanceResult(String corporateCode, String accountNumber, String balance, String statusCode, String statusDescription) {
        super();
        this.corporateCode = corporateCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    @JsonProperty("CorporateCode")
    public String getCorporateCode() {
        return corporateCode;
    }

    @JsonProperty("CorporateCode")
    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public GetAccountBalanceResult withCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
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

    public GetAccountBalanceResult withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @JsonProperty("Balance")
    public String getBalance() {
        return balance;
    }

    @JsonProperty("Balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public GetAccountBalanceResult withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public GetAccountBalanceResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @JsonProperty("StatusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("StatusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public GetAccountBalanceResult withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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

    public GetAccountBalanceResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetAccountBalanceResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("corporateCode");
        sb.append('=');
        sb.append(((this.corporateCode == null)?"<null>":this.corporateCode));
        sb.append(',');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("statusDescription");
        sb.append('=');
        sb.append(((this.statusDescription == null)?"<null>":this.statusDescription));
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
        result = ((result* 31)+((this.statusDescription == null)? 0 :this.statusDescription.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.corporateCode == null)? 0 :this.corporateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountNumber == null)? 0 :this.accountNumber.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountBalanceResult) == false) {
            return false;
        }
        GetAccountBalanceResult rhs = ((GetAccountBalanceResult) other);
        return (((((((this.statusDescription == rhs.statusDescription)||((this.statusDescription!= null)&&this.statusDescription.equals(rhs.statusDescription)))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.corporateCode == rhs.corporateCode)||((this.corporateCode!= null)&&this.corporateCode.equals(rhs.corporateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountNumber == rhs.accountNumber)||((this.accountNumber!= null)&&this.accountNumber.equals(rhs.accountNumber))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
