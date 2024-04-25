package edu.romans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class getNumericalValueTest {
    @Test
    public void getNumericalValue(){
        assertEquals(1, RomanNumber.getNumericalValue('I'));
        assertEquals(5, RomanNumber.getNumericalValue('V'));
        assertEquals(10, RomanNumber.getNumericalValue('X'));
        assertEquals(50, RomanNumber.getNumericalValue('L'));
        assertEquals(100, RomanNumber.getNumericalValue('C'));
        assertEquals(500, RomanNumber.getNumericalValue('D'));
        assertEquals(1000, RomanNumber.getNumericalValue('M'));

    }

}
