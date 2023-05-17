package com.introop.solid.liskovsubstitution;

public class RegularAccount extends Account {
    public RegularAccount(Double amount) {
        super(amount);
    }

    @Override
    public void withdrawal(Double withdrawalAmount) {
        if(this.getAmount() >= withdrawalAmount) {
            this.setAmount(this.getAmount() - withdrawalAmount);
        }
    }

    @Override
    public void deposit(Double depositAmount) {
        this.setAmount(this.getAmount() + depositAmount);
    }
}
