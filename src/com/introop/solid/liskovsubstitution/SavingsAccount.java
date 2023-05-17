package com.introop.solid.liskovsubstitution;

public class SavingsAccount extends Account {
    public SavingsAccount(Double amount) {
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
        this.setAmount(this.getAmount() + depositAmount + 5);
    }
}
