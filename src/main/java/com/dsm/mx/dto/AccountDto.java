package com.dsm.mx.dto;

public class AccountDto {
    //a class has attributes or properties
    //a class has one or more constructors
    //getters and setters
    private String accountId;
    private String accountName;
    private Long balance;
    private String accountType;

    public AccountDto() {
    }

    public AccountDto(String accountId, String accountName, Long balance, String accountType) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
