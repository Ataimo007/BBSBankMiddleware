
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
    "GetAccountBalanceResult"
})
@Generated("jsonschema2pojo")
public class GetAccountBalanceResponse {

    @JsonProperty("GetAccountBalanceResult")
    @Valid
    private GetAccountBalanceResult getAccountBalanceResult;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetAccountBalanceResponse() {
    }

    /**
     * 
     * @param getAccountBalanceResult
     */
    public GetAccountBalanceResponse(GetAccountBalanceResult getAccountBalanceResult) {
        super();
        this.getAccountBalanceResult = getAccountBalanceResult;
    }

    @JsonProperty("GetAccountBalanceResult")
    public GetAccountBalanceResult getGetAccountBalanceResult() {
        return getAccountBalanceResult;
    }

    @JsonProperty("GetAccountBalanceResult")
    public void setGetAccountBalanceResult(GetAccountBalanceResult getAccountBalanceResult) {
        this.getAccountBalanceResult = getAccountBalanceResult;
    }

    public GetAccountBalanceResponse withGetAccountBalanceResult(GetAccountBalanceResult getAccountBalanceResult) {
        this.getAccountBalanceResult = getAccountBalanceResult;
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

    public GetAccountBalanceResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GetAccountBalanceResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("getAccountBalanceResult");
        sb.append('=');
        sb.append(((this.getAccountBalanceResult == null)?"<null>":this.getAccountBalanceResult));
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
        result = ((result* 31)+((this.getAccountBalanceResult == null)? 0 :this.getAccountBalanceResult.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetAccountBalanceResponse) == false) {
            return false;
        }
        GetAccountBalanceResponse rhs = ((GetAccountBalanceResponse) other);
        return (((this.getAccountBalanceResult == rhs.getAccountBalanceResult)||((this.getAccountBalanceResult!= null)&&this.getAccountBalanceResult.equals(rhs.getAccountBalanceResult)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
