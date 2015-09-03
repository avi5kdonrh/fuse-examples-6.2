/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ProcessDefinition
 */
public class QueryRecordsProcessDefinition extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ProcessDefinition> records;

    public List<ProcessDefinition> getRecords() {
        return records;
    }

    public void setRecords(List<ProcessDefinition> records) {
        this.records = records;
    }
}
