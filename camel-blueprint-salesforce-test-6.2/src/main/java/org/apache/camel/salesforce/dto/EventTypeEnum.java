/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist EventType
 */
public enum EventTypeEnum {

    // API
    API("API"),
    // ApexCallout
    APEXCALLOUT("ApexCallout"),
    // ApexExecution
    APEXEXECUTION("ApexExecution"),
    // ApexSoap
    APEXSOAP("ApexSoap"),
    // ApexTrigger
    APEXTRIGGER("ApexTrigger"),
    // AsyncReportRun
    ASYNCREPORTRUN("AsyncReportRun"),
    // BulkApi
    BULKAPI("BulkApi"),
    // ChangeSetOperation
    CHANGESETOPERATION("ChangeSetOperation"),
    // ContentDistribution
    CONTENTDISTRIBUTION("ContentDistribution"),
    // ContentDocumentLink
    CONTENTDOCUMENTLINK("ContentDocumentLink"),
    // ContentTransfer
    CONTENTTRANSFER("ContentTransfer"),
    // Dashboard
    DASHBOARD("Dashboard"),
    // DocumentAttachmentDownloads
    DOCUMENTATTACHMENTDOWNLOADS("DocumentAttachmentDownloads"),
    // Login
    LOGIN("Login"),
    // LoginAs
    LOGINAS("LoginAs"),
    // Logout
    LOGOUT("Logout"),
    // MetadataApiOperation
    METADATAAPIOPERATION("MetadataApiOperation"),
    // MultiBlockReport
    MULTIBLOCKREPORT("MultiBlockReport"),
    // PackageInstall
    PACKAGEINSTALL("PackageInstall"),
    // QueuedExecution
    QUEUEDEXECUTION("QueuedExecution"),
    // Report
    REPORT("Report"),
    // ReportExport
    REPORTEXPORT("ReportExport"),
    // RestApi
    RESTAPI("RestApi"),
    // Sandbox
    SANDBOX("Sandbox"),
    // Sites
    SITES("Sites"),
    // TimeBasedWorkflow
    TIMEBASEDWORKFLOW("TimeBasedWorkflow"),
    // UITracking
    UITRACKING("UITracking"),
    // URI
    URI("URI"),
    // VisualforceRequest
    VISUALFORCEREQUEST("VisualforceRequest");

    final String value;

    private EventTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String value) {
        for (EventTypeEnum e : EventTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
