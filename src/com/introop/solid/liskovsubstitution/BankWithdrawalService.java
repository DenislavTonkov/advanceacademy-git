package com.introop.solid.liskovsubstitution;

public class BankWithdrawalService {
    private Account account;

    public BankWithdrawalService(Account account) {
        this.account = account;
    }

//    public void withdrawal(){
//        account.withdrawal(amount);
//    }

    public void print(){
        System.out.println(account.getAmount());
    }
}
