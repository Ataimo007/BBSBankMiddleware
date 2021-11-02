
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
    "BatchReference",
    "AccountNo",
    "StatusCode",
    "StatusDescription"
})
@Generated("jsonschema2pojo")
public class AddPaymentLocalResult {

    @JsonProperty("CorporateCode")
    private String corporateCode;
    @JsonProperty("BatchReference")
    private String batchReference;
    @JsonProperty("AccountNo")
    private String accountNo;
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
    public AddPaymentLocalResult() {
    }

    /**
     * 
     * @param batchReference
     * @param statusDescription
     * @param accountNo
     * @param corporateCode
     * @param statusCode
     */
    public AddPaymentLocalResult(String corporateCode, String batchReference, String accountNo, String statusCode, String statusDescription) {
        super();
        this.corporateCode = corporateCode;
        this.batchReference = batchReference;
        this.accountNo = accountNo;
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

    public AddPaymentLocalResult withCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
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

    public AddPaymentLocalResult withBatchReference(String batchReference) {
        this.batchReference = batchReference;
        return this;
    }

    @JsonProperty("AccountNo")
    public String getAccountNo() {
        return accountNo;
    }

    @JsonProperty("AccountNo")
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public AddPaymentLocalResult withAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public AddPaymentLocalResult withStatusCode(String statusCode) {
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

    public AddPaymentLocalResult withStatusDescription(String statusDescription) {
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

    public AddPaymentLocalResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddPaymentLocalResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("corporateCode");
        sb.append('=');
        sb.append(((this.corporateCode == null)?"<null>":this.corporateCode));
        sb.append(',');
        sb.append("batchReference");
        sb.append('=');
        sb.append(((this.batchReference == null)?"<null>":this.batchReference));
        sb.append(',');
        sb.append("accountNo");
        sb.append('=');
        sb.append(((this.accountNo == null)?"<null>":this.accountNo));
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
        result = ((result* 31)+((this.batchReference == null)? 0 :this.batchReference.hashCode()));
        result = ((result* 31)+((this.statusDescription == null)? 0 :this.statusDescription.hashCode()));
        result = ((result* 31)+((this.accountNo == null)? 0 :this.accountNo.hashCode()));
        result = ((result* 31)+((this.corporateCode == null)? 0 :this.corporateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddPaymentLocalResult) == false) {
            return false;
        }
        AddPaymentLocalResult rhs = ((AddPaymentLocalResult) other);
        return (((((((this.batchReference == rhs.batchReference)||((this.batchReference!= null)&&this.batchReference.equals(rhs.batchReference)))&&((this.statusDescription == rhs.statusDescription)||((this.statusDescription!= null)&&this.statusDescription.equals(rhs.statusDescription))))&&((this.accountNo == rhs.accountNo)||((this.accountNo!= null)&&this.accountNo.equals(rhs.accountNo))))&&((this.corporateCode == rhs.corporateCode)||((this.corporateCode!= null)&&this.corporateCode.equals(rhs.corporateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
