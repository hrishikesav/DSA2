package com.hrishi.problems;

public class RomanNumerals {
    public static void main(String[] args) {
        int num = 3724;
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","LC"};
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        StringBuilder strBuilder = new StringBuilder();

        while(num >= 1000) {
            num -= 1000;
            strBuilder.append("M");
        }

        strBuilder.append(hundreds[num/100]);
        num = num%100;

        strBuilder.append(tens[num/10]);
        num = num%10;

        strBuilder.append(ones[num]);

        System.out.println("Roman numeral= " + strBuilder.toString());
    }
}
