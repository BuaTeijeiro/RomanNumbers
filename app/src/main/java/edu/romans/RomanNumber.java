package edu.romans;


public class RomanNumber {
    private String roman;
    private static final String REGEX = "M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";

    public String getRoman() {
        return roman;
    }

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public boolean checkValidity() {
        return this.getRoman().matches(RomanNumber.REGEX);
    }

    private static int getNumericalValue(String letter){
        return LetterValues.valueOf(letter).getValue();
    }

    private int computeDecimal(){
        String revereseString = new StringBuilder(this.getRoman()).reverse().toString();
        String previousChar = "I";
        int total = 0;
        for (int i =0 ; i< revereseString.length(); i++) {
            String character =  String.valueOf(revereseString.charAt(i));
            int letterValue = RomanNumber.getNumericalValue(character);
            if (letterValue >= RomanNumber.getNumericalValue(previousChar)){
                total += letterValue;
            } else{
                total -= letterValue;
            }
            previousChar = character;
        }
        return total;
    }

    public int toDecimal(){
        if(this.checkValidity()){
            return this.computeDecimal();
        } else {
            return 0;
        }
    
    }

    

}
