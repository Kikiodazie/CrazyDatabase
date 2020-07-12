package com.odazie.cardchecker.cardchecker.data.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @Column(name = "CARD_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long cardId;
    @Column(name = "CARD_OWNER_NAME")
    private String cardOwnerName;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;
    @Column(name = "CVV")
    private String cvv;
    @Column(name = "CARD_TYPE")
    private String cardType;
    @Column(name = "BANK")
    private String bankName;


    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
