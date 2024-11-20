package com.example.SwizzSoft_Sms_app.Contacts;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;
    private String contactName;
    private Integer phoneNumber;
    private Integer groupId;
    private Integer organisationCode;
    private Date createdDate;

    public Contact(Long contactId, String contactName, Integer phoneNumber, Integer groupId, Integer organisationCode, Date createdDate) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
        this.organisationCode = organisationCode;
        this.createdDate = createdDate;
    }

    public Contact() {
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getOrganisationCode() {
        return organisationCode;
    }

    public void setOrganisationCode(Integer organisationCode) {
        this.organisationCode = organisationCode;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
