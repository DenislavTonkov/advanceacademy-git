package com.introop.solid.liskovsubstitution;

public abstract class Account {
    private Double amount;

    public Account(Double amount) {
        this.amount = amount;
    }

    public abstract void withdrawal(Double withdrawalAmount);

    public abstract void deposit(Double depositAmount);

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
