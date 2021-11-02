
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
    "AccountNumber"
})
@Generated("jsonschema2pojo")
public class Request {

    @JsonProperty("CorporateCode")
    private String corporateCode;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Request() {
    }

    /**
     * 
     * @param corporateCode
     * @param accountNumber
     */
    public Request(String corporateCode, String accountNumber) {
        super();
        this.corporateCode = corporateCode;
        this.accountNumber = accountNumber;
    }

    @JsonProperty("CorporateCode")
    public String getCorporateCode() {
        return corporateCode;
    }

    @JsonProperty("CorporateCode")
    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public Request withCorporateCode(String corporateCode) {
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

    public Request withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public Request withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Request.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("corporateCode");
        sb.append('=');
        sb.append(((this.corporateCode == null)?"<null>":this.corporateCode));
        sb.append(',');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
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
        result = ((result* 31)+((this.corporateCode == null)? 0 :this.corporateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountNumber == null)? 0 :this.accountNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return ((((this.corporateCode == rhs.corporateCode)||((this.corporateCode!= null)&&this.corporateCode.equals(rhs.corporateCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountNumber == rhs.accountNumber)||((this.accountNumber!= null)&&this.accountNumber.equals(rhs.accountNumber))));
    }

}
