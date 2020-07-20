/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import static math.util.MathUtil.computeFactory;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    @Test
    public void testSuccessfulCase(){
        assertEquals(120, math.util.MathUtil.computeFactory(5));
        assertEquals(720, math.util.MathUtil.computeFactory(6));
        assertEquals(1, math.util.MathUtil.computeFactory(0));
        assertEquals(1, math.util.MathUtil.computeFactory(1));
        assertEquals(2, math.util.MathUtil.computeFactory(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    
    public void testFailedCases(){
        computeFactory(-5);
        computeFactory(16);
    }
}
