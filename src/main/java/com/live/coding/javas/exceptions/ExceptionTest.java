package com.live.coding.javas.exceptions;

public class ExceptionTest {

    int test (){
        int b= 10,c=0;
        try{
            int a = b/c;

        } catch (Exception e){
           return 2;
        }
        finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        System.out.println(et.test());
    }
}
