package com.live.coding.javas.patterns.proxy.ex3;

// TODO: 13.04.2022 https://www.javatpoint.com/proxy-pattern 
public class ProxyPatternClient {
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}