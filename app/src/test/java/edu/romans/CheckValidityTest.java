package edu.romans;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CheckValidityTest {

    @Test
    public void checkSingleLetters(){
        RomanNumber singleLetter = new RomanNumber("I");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("V");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("X");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("L");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("C");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("D");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("M");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("R");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("U");
        assertFalse(singleLetter.checkValidity());

    }
    @Test
    public void checkSeveralLetters(){
        RomanNumber singleLetter = new RomanNumber("XVI");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("CMX");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("MMMCCCXXXIII");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("LXIV");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("MMCDXIII");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("DCCCXL");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("ML");
        assertTrue(singleLetter.checkValidity());
        singleLetter = new RomanNumber("MMMK");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("CMC");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("MMMXXXX");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("LL");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("CDD");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("LXM");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("IC");
        assertFalse(singleLetter.checkValidity());
        singleLetter = new RomanNumber("IM");
        assertFalse(singleLetter.checkValidity());

    }



}
