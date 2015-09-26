/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CategoryData
 */
@XStreamAlias("CategoryData")
public class CategoryData extends AbstractSObjectBase {

    // CategoryNodeId
    private String CategoryNodeId;

    @JsonProperty("CategoryNodeId")
    public String getCategoryNodeId() {
        return this.CategoryNodeId;
    }

    @JsonProperty("CategoryNodeId")
    public void setCategoryNodeId(String CategoryNodeId) {
        this.CategoryNodeId = CategoryNodeId;
    }

    // RelatedSobjectId
    private String RelatedSobjectId;

    @JsonProperty("RelatedSobjectId")
    public String getRelatedSobjectId() {
        return this.RelatedSobjectId;
    }

    @JsonProperty("RelatedSobjectId")
    public void setRelatedSobjectId(String RelatedSobjectId) {
        this.RelatedSobjectId = RelatedSobjectId;
    }

}