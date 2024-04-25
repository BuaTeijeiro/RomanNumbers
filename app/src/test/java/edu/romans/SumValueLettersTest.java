package edu.romans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumValueLettersTest {
    @Test
    public void SameLettersTest(){
        assertEquals(2, RomanNumber.sumValueLetters("II"));
        assertEquals(3, RomanNumber.sumValueLetters("III"));
        assertEquals(20, RomanNumber.sumValueLetters("XX"));
        assertEquals(30, RomanNumber.sumValueLetters("XXX"));
        assertEquals(200, RomanNumber.sumValueLetters("CC"));
        assertEquals(300, RomanNumber.sumValueLetters("CCC"));
        assertEquals(2000, RomanNumber.sumValueLetters("MM"));
        assertEquals(3000, RomanNumber.sumValueLetters("MMM"));
    }

    @Test void CombinationLettersTest(){
        assertEquals(7, RomanNumber.sumValueLetters("VII"));
        assertEquals(13, RomanNumber.sumValueLetters("XIII"));
        assertEquals(25, RomanNumber.sumValueLetters("XXV"));
        assertEquals(82, RomanNumber.sumValueLetters("LXXXII"));
        assertEquals(261, RomanNumber.sumValueLetters("CCLXI"));
        assertEquals(620, RomanNumber.sumValueLetters("DCXX"));
        assertEquals(2272, RomanNumber.sumValueLetters("MMCCLXXII"));
        assertEquals(1666, RomanNumber.sumValueLetters("MDCLXVI"));
    }
}
