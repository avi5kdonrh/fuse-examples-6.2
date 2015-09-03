/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject LoginIp
 */
@XStreamAlias("LoginIp")
public class LoginIp extends AbstractSObjectBase {

    // UsersId
    private String UsersId;

    @JsonProperty("UsersId")
    public String getUsersId() {
        return this.UsersId;
    }

    @JsonProperty("UsersId")
    public void setUsersId(String UsersId) {
        this.UsersId = UsersId;
    }

    // SourceIp
    private String SourceIp;

    @JsonProperty("SourceIp")
    public String getSourceIp() {
        return this.SourceIp;
    }

    @JsonProperty("SourceIp")
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    // IsAuthenticated
    private Boolean IsAuthenticated;

    @JsonProperty("IsAuthenticated")
    public Boolean getIsAuthenticated() {
        return this.IsAuthenticated;
    }

    @JsonProperty("IsAuthenticated")
    public void setIsAuthenticated(Boolean IsAuthenticated) {
        this.IsAuthenticated = IsAuthenticated;
    }

    // ChallengeSentDate
    private org.joda.time.DateTime ChallengeSentDate;

    @JsonProperty("ChallengeSentDate")
    public org.joda.time.DateTime getChallengeSentDate() {
        return this.ChallengeSentDate;
    }

    @JsonProperty("ChallengeSentDate")
    public void setChallengeSentDate(org.joda.time.DateTime ChallengeSentDate) {
        this.ChallengeSentDate = ChallengeSentDate;
    }

    // ChallengeMethod
    @XStreamConverter(PicklistEnumConverter.class)
    private ChallengeMethodEnum ChallengeMethod;

    @JsonProperty("ChallengeMethod")
    public ChallengeMethodEnum getChallengeMethod() {
        return this.ChallengeMethod;
    }

    @JsonProperty("ChallengeMethod")
    public void setChallengeMethod(ChallengeMethodEnum ChallengeMethod) {
        this.ChallengeMethod = ChallengeMethod;
    }

}
