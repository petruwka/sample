package org.example;

import java.math.BigDecimal;

public class Transaction {
    private Account account;
    private Type type;
    private String currency;
    private BigDecimal amount;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }



    public enum Type {
        WITHDRAWAL, DEPOSIT, PAYMENT
    }
}
