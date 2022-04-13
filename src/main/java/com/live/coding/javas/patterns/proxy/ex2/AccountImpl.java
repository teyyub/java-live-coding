package com.live.coding.javas.patterns.proxy.ex2;

public class AccountImpl implements Account {
    @Override
    public void queryAccount() {
        System.out.println("View the account");
    }

    @Override
    public void updateAccount() {
        System.out.println("Modify the account");
    }
}