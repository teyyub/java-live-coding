package com.live.coding.javas.patterns.proxy.ex2;

// TODO: 13.04.2022 https://www.alibabacloud.com/forum/read-386 
public class AccountProxyTest {
    public static void main(String[] args) {
        //AccountProxy is a self-implemented proxy class, and we can find that a proxy class can only serve an interface.
        Account account = new AccountImpl();
        AccountProxy proxy = new AccountProxy(account);
        proxy.queryAccount();
        proxy.updateAccount();
    }
}