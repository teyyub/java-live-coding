package com.live.coding.primeNumber;


/**
 *  3, 5, 7, 11, 13, 17
 * */
public class PrimeNumber {
    public static void main(String[] args) {

//        int i = 19;
        for(int i=3;i<1000 ; i++){
            if(isPrice(i)){
                System.out.print(i+ ", ");
            }
        }
    }
    static boolean isPrice(int number){
        boolean isPrime = false;
        for(int i=2;i<number;i++){
              if( number%i==0) {
                  isPrime = true;
                  break;
              }
        }
        return !isPrime;
    }

}
