package com.live.coding;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class IsPossibleToSum {

    // take one value from each array and sum them up, is it possible to get x?
    // for example: [6,3,9], [3,1,2], [7,6,5]
    // x=9 == true, 3+1+5 =9
    // x=8 == false
    // x=21 == false
    public boolean isPossibleToSum(int[] a, int[] b, int[] c, int x) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    if(a[i]+b[j]+c[k]==x)
                        return true;
                }
            }
        }
        return false;
    }

    @Test
    public void test() {
        int[] a = new int[] { 6, 3, 9 };
        int[] b = new int[] { 3, 1, 2 };
        int[] c = new int[] { 7, 6, 5 };

        assertTrue(isPossibleToSum(a, b, c, 9));
        assertFalse(isPossibleToSum(a, b, c, 8));
        assertFalse(isPossibleToSum(a, b, c, 21));
    }
}