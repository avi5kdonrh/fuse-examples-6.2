/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TableEnumOrId
 */
public enum TableEnumOrIdEnum {

    // Account
    ACCOUNT("Account"),
    // Asset
    ASSET("Asset"),
    // Campaign
    CAMPAIGN("Campaign"),
    // Case
    CASE("Case"),
    // Contact
    CONTACT("Contact"),
    // Contract
    CONTRACT("Contract"),
    // DuplicateRecordItem
    DUPLICATERECORDITEM("DuplicateRecordItem"),
    // DuplicateRecordSet
    DUPLICATERECORDSET("DuplicateRecordSet"),
    // Goal
    GOAL("Goal"),
    // GoalLink
    GOALLINK("GoalLink"),
    // KnowledgeArticle
    KNOWLEDGEARTICLE("KnowledgeArticle"),
    // KnowledgeArticleVersion
    KNOWLEDGEARTICLEVERSION("KnowledgeArticleVersion"),
    // Lead
    LEAD("Lead"),
    // Metric
    METRIC("Metric"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // Order
    ORDER("Order"),
    // Product2
    PRODUCT2("Product2"),
    // Solution
    SOLUTION("Solution"),
    // StreamingChannel
    STREAMINGCHANNEL("StreamingChannel"),
    // UserProvisioningRequest
    USERPROVISIONINGREQUEST("UserProvisioningRequest"),
    // WorkCoaching
    WORKCOACHING("WorkCoaching"),
    // WorkFeedback
    WORKFEEDBACK("WorkFeedback"),
    // WorkFeedbackQuestion
    WORKFEEDBACKQUESTION("WorkFeedbackQuestion"),
    // WorkFeedbackQuestionSet
    WORKFEEDBACKQUESTIONSET("WorkFeedbackQuestionSet"),
    // WorkFeedbackRequest
    WORKFEEDBACKREQUEST("WorkFeedbackRequest"),
    // WorkFeedbackTemplate
    WORKFEEDBACKTEMPLATE("WorkFeedbackTemplate"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private TableEnumOrIdEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TableEnumOrIdEnum fromValue(String value) {
        for (TableEnumOrIdEnum e : TableEnumOrIdEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
