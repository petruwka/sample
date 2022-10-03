package org.example;

import java.util.Objects;

public class Account {
    private String userId;
    private String accountId;
    private boolean vip;

    public Account(String userId, String accountId) {
        this.userId = userId;
        this.accountId = accountId;
    }

    public Account(String userId, String accountId, boolean vip) {
        this.userId = userId;
        this.accountId = accountId;
        this.vip = vip;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return vip == account.vip && Objects.equals(userId, account.userId) && Objects.equals(accountId, account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, accountId, vip);
    }
}
