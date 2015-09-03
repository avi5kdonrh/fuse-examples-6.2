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
 * Salesforce DTO for SObject Event
 */
@XStreamAlias("Event")
public class Event extends AbstractSObjectBase {

    // WhoId
    private String WhoId;

    @JsonProperty("WhoId")
    public String getWhoId() {
        return this.WhoId;
    }

    @JsonProperty("WhoId")
    public void setWhoId(String WhoId) {
        this.WhoId = WhoId;
    }

    // WhatId
    private String WhatId;

    @JsonProperty("WhatId")
    public String getWhatId() {
        return this.WhatId;
    }

    @JsonProperty("WhatId")
    public void setWhatId(String WhatId) {
        this.WhatId = WhatId;
    }

    // Subject
    private String Subject;

    @JsonProperty("Subject")
    public String getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    // Location
    private String Location;

    @JsonProperty("Location")
    public String getLocation() {
        return this.Location;
    }

    @JsonProperty("Location")
    public void setLocation(String Location) {
        this.Location = Location;
    }

    // IsAllDayEvent
    private Boolean IsAllDayEvent;

    @JsonProperty("IsAllDayEvent")
    public Boolean getIsAllDayEvent() {
        return this.IsAllDayEvent;
    }

    @JsonProperty("IsAllDayEvent")
    public void setIsAllDayEvent(Boolean IsAllDayEvent) {
        this.IsAllDayEvent = IsAllDayEvent;
    }

    // ActivityDateTime
    private org.joda.time.DateTime ActivityDateTime;

    @JsonProperty("ActivityDateTime")
    public org.joda.time.DateTime getActivityDateTime() {
        return this.ActivityDateTime;
    }

    @JsonProperty("ActivityDateTime")
    public void setActivityDateTime(org.joda.time.DateTime ActivityDateTime) {
        this.ActivityDateTime = ActivityDateTime;
    }

    // ActivityDate
    private org.joda.time.DateTime ActivityDate;

    @JsonProperty("ActivityDate")
    public org.joda.time.DateTime getActivityDate() {
        return this.ActivityDate;
    }

    @JsonProperty("ActivityDate")
    public void setActivityDate(org.joda.time.DateTime ActivityDate) {
        this.ActivityDate = ActivityDate;
    }

    // DurationInMinutes
    private Integer DurationInMinutes;

    @JsonProperty("DurationInMinutes")
    public Integer getDurationInMinutes() {
        return this.DurationInMinutes;
    }

    @JsonProperty("DurationInMinutes")
    public void setDurationInMinutes(Integer DurationInMinutes) {
        this.DurationInMinutes = DurationInMinutes;
    }

    // StartDateTime
    private org.joda.time.DateTime StartDateTime;

    @JsonProperty("StartDateTime")
    public org.joda.time.DateTime getStartDateTime() {
        return this.StartDateTime;
    }

    @JsonProperty("StartDateTime")
    public void setStartDateTime(org.joda.time.DateTime StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    // EndDateTime
    private org.joda.time.DateTime EndDateTime;

    @JsonProperty("EndDateTime")
    public org.joda.time.DateTime getEndDateTime() {
        return this.EndDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(org.joda.time.DateTime EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // IsPrivate
    private Boolean IsPrivate;

    @JsonProperty("IsPrivate")
    public Boolean getIsPrivate() {
        return this.IsPrivate;
    }

    @JsonProperty("IsPrivate")
    public void setIsPrivate(Boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    // ShowAs
    @XStreamConverter(PicklistEnumConverter.class)
    private ShowAsEnum ShowAs;

    @JsonProperty("ShowAs")
    public ShowAsEnum getShowAs() {
        return this.ShowAs;
    }

    @JsonProperty("ShowAs")
    public void setShowAs(ShowAsEnum ShowAs) {
        this.ShowAs = ShowAs;
    }

    // IsChild
    private Boolean IsChild;

    @JsonProperty("IsChild")
    public Boolean getIsChild() {
        return this.IsChild;
    }

    @JsonProperty("IsChild")
    public void setIsChild(Boolean IsChild) {
        this.IsChild = IsChild;
    }

    // IsGroupEvent
    private Boolean IsGroupEvent;

    @JsonProperty("IsGroupEvent")
    public Boolean getIsGroupEvent() {
        return this.IsGroupEvent;
    }

    @JsonProperty("IsGroupEvent")
    public void setIsGroupEvent(Boolean IsGroupEvent) {
        this.IsGroupEvent = IsGroupEvent;
    }

    // GroupEventType
    @XStreamConverter(PicklistEnumConverter.class)
    private GroupEventTypeEnum GroupEventType;

    @JsonProperty("GroupEventType")
    public GroupEventTypeEnum getGroupEventType() {
        return this.GroupEventType;
    }

    @JsonProperty("GroupEventType")
    public void setGroupEventType(GroupEventTypeEnum GroupEventType) {
        this.GroupEventType = GroupEventType;
    }

    // IsArchived
    private Boolean IsArchived;

    @JsonProperty("IsArchived")
    public Boolean getIsArchived() {
        return this.IsArchived;
    }

    @JsonProperty("IsArchived")
    public void setIsArchived(Boolean IsArchived) {
        this.IsArchived = IsArchived;
    }

    // RecurrenceActivityId
    private String RecurrenceActivityId;

    @JsonProperty("RecurrenceActivityId")
    public String getRecurrenceActivityId() {
        return this.RecurrenceActivityId;
    }

    @JsonProperty("RecurrenceActivityId")
    public void setRecurrenceActivityId(String RecurrenceActivityId) {
        this.RecurrenceActivityId = RecurrenceActivityId;
    }

    // IsRecurrence
    private Boolean IsRecurrence;

    @JsonProperty("IsRecurrence")
    public Boolean getIsRecurrence() {
        return this.IsRecurrence;
    }

    @JsonProperty("IsRecurrence")
    public void setIsRecurrence(Boolean IsRecurrence) {
        this.IsRecurrence = IsRecurrence;
    }

    // RecurrenceStartDateTime
    private org.joda.time.DateTime RecurrenceStartDateTime;

    @JsonProperty("RecurrenceStartDateTime")
    public org.joda.time.DateTime getRecurrenceStartDateTime() {
        return this.RecurrenceStartDateTime;
    }

    @JsonProperty("RecurrenceStartDateTime")
    public void setRecurrenceStartDateTime(org.joda.time.DateTime RecurrenceStartDateTime) {
        this.RecurrenceStartDateTime = RecurrenceStartDateTime;
    }

    // RecurrenceEndDateOnly
    private org.joda.time.DateTime RecurrenceEndDateOnly;

    @JsonProperty("RecurrenceEndDateOnly")
    public org.joda.time.DateTime getRecurrenceEndDateOnly() {
        return this.RecurrenceEndDateOnly;
    }

    @JsonProperty("RecurrenceEndDateOnly")
    public void setRecurrenceEndDateOnly(org.joda.time.DateTime RecurrenceEndDateOnly) {
        this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    }

    // RecurrenceTimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey;

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public RecurrenceTimeZoneSidKeyEnum getRecurrenceTimeZoneSidKey() {
        return this.RecurrenceTimeZoneSidKey;
    }

    @JsonProperty("RecurrenceTimeZoneSidKey")
    public void setRecurrenceTimeZoneSidKey(RecurrenceTimeZoneSidKeyEnum RecurrenceTimeZoneSidKey) {
        this.RecurrenceTimeZoneSidKey = RecurrenceTimeZoneSidKey;
    }

    // RecurrenceType
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceTypeEnum RecurrenceType;

    @JsonProperty("RecurrenceType")
    public RecurrenceTypeEnum getRecurrenceType() {
        return this.RecurrenceType;
    }

    @JsonProperty("RecurrenceType")
    public void setRecurrenceType(RecurrenceTypeEnum RecurrenceType) {
        this.RecurrenceType = RecurrenceType;
    }

    // RecurrenceInterval
    private Integer RecurrenceInterval;

    @JsonProperty("RecurrenceInterval")
    public Integer getRecurrenceInterval() {
        return this.RecurrenceInterval;
    }

    @JsonProperty("RecurrenceInterval")
    public void setRecurrenceInterval(Integer RecurrenceInterval) {
        this.RecurrenceInterval = RecurrenceInterval;
    }

    // RecurrenceDayOfWeekMask
    private Integer RecurrenceDayOfWeekMask;

    @JsonProperty("RecurrenceDayOfWeekMask")
    public Integer getRecurrenceDayOfWeekMask() {
        return this.RecurrenceDayOfWeekMask;
    }

    @JsonProperty("RecurrenceDayOfWeekMask")
    public void setRecurrenceDayOfWeekMask(Integer RecurrenceDayOfWeekMask) {
        this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    }

    // RecurrenceDayOfMonth
    private Integer RecurrenceDayOfMonth;

    @JsonProperty("RecurrenceDayOfMonth")
    public Integer getRecurrenceDayOfMonth() {
        return this.RecurrenceDayOfMonth;
    }

    @JsonProperty("RecurrenceDayOfMonth")
    public void setRecurrenceDayOfMonth(Integer RecurrenceDayOfMonth) {
        this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    }

    // RecurrenceInstance
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceInstanceEnum RecurrenceInstance;

    @JsonProperty("RecurrenceInstance")
    public RecurrenceInstanceEnum getRecurrenceInstance() {
        return this.RecurrenceInstance;
    }

    @JsonProperty("RecurrenceInstance")
    public void setRecurrenceInstance(RecurrenceInstanceEnum RecurrenceInstance) {
        this.RecurrenceInstance = RecurrenceInstance;
    }

    // RecurrenceMonthOfYear
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceMonthOfYearEnum RecurrenceMonthOfYear;

    @JsonProperty("RecurrenceMonthOfYear")
    public RecurrenceMonthOfYearEnum getRecurrenceMonthOfYear() {
        return this.RecurrenceMonthOfYear;
    }

    @JsonProperty("RecurrenceMonthOfYear")
    public void setRecurrenceMonthOfYear(RecurrenceMonthOfYearEnum RecurrenceMonthOfYear) {
        this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    }

    // ReminderDateTime
    private org.joda.time.DateTime ReminderDateTime;

    @JsonProperty("ReminderDateTime")
    public org.joda.time.DateTime getReminderDateTime() {
        return this.ReminderDateTime;
    }

    @JsonProperty("ReminderDateTime")
    public void setReminderDateTime(org.joda.time.DateTime ReminderDateTime) {
        this.ReminderDateTime = ReminderDateTime;
    }

    // IsReminderSet
    private Boolean IsReminderSet;

    @JsonProperty("IsReminderSet")
    public Boolean getIsReminderSet() {
        return this.IsReminderSet;
    }

    @JsonProperty("IsReminderSet")
    public void setIsReminderSet(Boolean IsReminderSet) {
        this.IsReminderSet = IsReminderSet;
    }

}
