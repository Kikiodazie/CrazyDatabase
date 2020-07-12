package com.odazie.cardchecker.cardchecker.data.entity;


import javax.persistence.*;

@Entity
@Table(name = "CARD_OWNER")
public class CardOwner {
    @Id
    @Column(name = "CARD_OWNER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long cardOwnerId;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "STATE")
    private String state;
    @Column(name = "PHONE_NUMBER")
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
