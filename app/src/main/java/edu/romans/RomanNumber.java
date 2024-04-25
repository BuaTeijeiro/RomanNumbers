package edu.romans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String roman;
    private static final String VALID_ROMAN_EXPRESSION = "M{0,3}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})";
    private static final String SUBSTRACTION_GROUPS = "(C[MD]|X[CL]|I[XV])";

    public String getRoman() {
        return roman;
    }

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public boolean checkValidity() {
        return this.getRoman().matches(RomanNumber.VALID_ROMAN_EXPRESSION);
    }

    public int toDecimal(){
        if(this.checkValidity()){
            return this.computeDecimal();
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return this.getRoman();
    }

    static int getNumericalValue(char letter){
        return LetterValues.valueOf(String.valueOf(letter)).getValue();
    }

    static int getValueSubstractionGroup(String group){
        return RomanNumber.getNumericalValue(group.charAt(1)) - RomanNumber.getNumericalValue(group.charAt(0));
    }

    static int sumValueLetters(String roman){
        int total = 0;
        for (char letter : roman.toCharArray()){
            total += RomanNumber.getNumericalValue(letter);
        }
        return total;
    }

    private int computeDecimal(){
        int total = 0;
        String romanNumeral = this.getRoman();
        String replacement = "";
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile(RomanNumber.SUBSTRACTION_GROUPS);
        Matcher m = p.matcher(romanNumeral);

        while (m.find()){
                total += RomanNumber.getValueSubstractionGroup(m.group());
                m.appendReplacement(sb, replacement);
            }
        
        m.appendTail(sb);
        romanNumeral = sb.toString();
        return total + RomanNumber.sumValueLetters(romanNumeral);
    }

    

    

}
