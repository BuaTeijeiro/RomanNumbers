package edu.romans;


public class RomanNumber {
    private String roman;
    private static final String REGEX = "M{0,3}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})";

    public String getRoman() {
        return roman;
    }

    public RomanNumber(String roman) {
        this.roman = roman;
    }

    public boolean checkValidity() {
        return this.getRoman().matches(RomanNumber.REGEX);
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

    private static int getNumericalValue(char letter){
        return LetterValues.valueOf(String.valueOf(letter)).getValue();
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

}
