package com.odazie.cardchecker.cardchecker.business.domain;


public class CardOwner {

    private long cardOwnerId;
    private String fullName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;

    public long getCardOwnerId() {
        return cardOwnerId;
    }

    public void setCardOwnerId(long cardOwnerId) {
        this.cardOwnerId = cardOwnerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
