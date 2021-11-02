
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
    "AddPaymentLocalResult"
})
@Generated("jsonschema2pojo")
public class LocalPaymentResponse {

    @JsonProperty("AddPaymentLocalResult")
    @Valid
    private AddPaymentLocalResult addPaymentLocalResult;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LocalPaymentResponse() {
    }

    /**
     * 
     * @param addPaymentLocalResult
     */
    public LocalPaymentResponse(AddPaymentLocalResult addPaymentLocalResult) {
        super();
        this.addPaymentLocalResult = addPaymentLocalResult;
    }

    @JsonProperty("AddPaymentLocalResult")
    public AddPaymentLocalResult getAddPaymentLocalResult() {
        return addPaymentLocalResult;
    }

    @JsonProperty("AddPaymentLocalResult")
    public void setAddPaymentLocalResult(AddPaymentLocalResult addPaymentLocalResult) {
        this.addPaymentLocalResult = addPaymentLocalResult;
    }

    public LocalPaymentResponse withAddPaymentLocalResult(AddPaymentLocalResult addPaymentLocalResult) {
        this.addPaymentLocalResult = addPaymentLocalResult;
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

    public LocalPaymentResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalPaymentResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addPaymentLocalResult");
        sb.append('=');
        sb.append(((this.addPaymentLocalResult == null)?"<null>":this.addPaymentLocalResult));
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
        result = ((result* 31)+((this.addPaymentLocalResult == null)? 0 :this.addPaymentLocalResult.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalPaymentResponse) == false) {
            return false;
        }
        LocalPaymentResponse rhs = ((LocalPaymentResponse) other);
        return (((this.addPaymentLocalResult == rhs.addPaymentLocalResult)||((this.addPaymentLocalResult!= null)&&this.addPaymentLocalResult.equals(rhs.addPaymentLocalResult)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
