package edu.romans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class getValueSubstractionGroupTest {
    @Test
    public void getNumericalValue(){
        assertEquals(4, RomanNumber.getValueSubstractionGroup("IV"));
        assertEquals(9, RomanNumber.getValueSubstractionGroup("IX"));
        assertEquals(40, RomanNumber.getValueSubstractionGroup("XL"));
        assertEquals(90, RomanNumber.getValueSubstractionGroup("XC"));
        assertEquals(400, RomanNumber.getValueSubstractionGroup("CD"));
        assertEquals(900, RomanNumber.getValueSubstractionGroup("CM"));
    }
}
