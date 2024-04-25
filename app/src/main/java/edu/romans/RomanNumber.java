package edu.romans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String roman;
    private static final String REGEX = "M{0,3}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})";
    private static final String[] SUBSTRACTIONGROUPS = {"CM","CD","XC","XL","IX","IV"};

    public String getRoman() {
        return roman;
    }

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public boolean checkValidity() {
        return this.getRoman().matches(RomanNumber.REGEX);
    }

    private static int getNumericalValue(char letter){
        return LetterValues.valueOf(String.valueOf(letter)).getValue();
    }

    private static int getValueSubstractionGroup(String group){
        return RomanNumber.getNumericalValue(group.charAt(1)) - RomanNumber.getNumericalValue(group.charAt(0));
    }

    private int computeDecimal(){
        String revereseString = new StringBuilder(this.getRoman()).reverse().toString();
        char[] chars = revereseString.toCharArray();
        char previousChar = 'I';
        int total = 0;
        for (char letter : chars){
            int letterValue = RomanNumber.getNumericalValue(letter);
            if (letterValue >= RomanNumber.getNumericalValue(previousChar)){
                total += letterValue;
            } else{
                total -= letterValue;
            }
            previousChar = letter;
        }
        return total;
    }

    private int computeDecimalRegex(){
        int total = 0;
        String romanNumeral = this.getRoman();
        String replacement = "";
        for (String group : RomanNumber.SUBSTRACTIONGROUPS){
            StringBuffer sb = new StringBuffer();
            Pattern p = Pattern.compile(group);
            Matcher m = p.matcher(romanNumeral);
            if (m.find()){
                total += RomanNumber.getValueSubstractionGroup(m.group());
                m.appendReplacement(sb, replacement);
                m.appendTail(sb);
                romanNumeral = sb.toString();
            }
        }
        for (char letter : romanNumeral.toCharArray()){
            total += RomanNumber.getNumericalValue(letter);
        }
        return total;
    }

    public int toDecimal(){
        if(this.checkValidity()){
            return this.computeDecimalRegex();
        } else {
            return 0;
        }
    
    }

    

}
