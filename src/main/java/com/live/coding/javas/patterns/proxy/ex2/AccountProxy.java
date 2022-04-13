package com.live.coding.javas.patterns.proxy.ex2;

public class AccountProxy implements Account {
    private Account account;
    public AccountProxy(Account account) {
        super();
        this.account = account;
    }

    @Override
    public void queryAccount() {
        System.out.println("Implement proxy before");
        account.queryAccount();
        System.out.println("Implement proxy after");
    }

    @Override
    public void updateAccount() {
        System.out.println("Implement proxy before");
        account.updateAccount();
        System.out.println("Implement proxy after");
    }
}
