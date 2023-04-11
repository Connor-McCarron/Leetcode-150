package com.leet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest 
{

    @Test
    public void t1()
    {
        assertTrue(Solution.twoSum(new int[]{2,7,11,15}, 9).equals(new int[]{0,1}));
    }

    @Test
    public void t2()
    {
        assertTrue(Solution.twoSum(new int[]{3,2,4}, 6).equals(new int[]{1,2}));
    }

    @Test
    public void t3()
    {
        assertTrue(Solution.twoSum(new int[]{3,3}, 6).equals(new int[]{0,1}));
    }
}
