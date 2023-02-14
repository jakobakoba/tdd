package com.example.middleinterview.parsers;

public class ByteParser implements TypeParser<Object> {


    @Override
    public Byte parse(String input) {
        boolean isNegative = input.charAt(0) == '-';
        if (isNegative) {
            input = input.substring(1);
        }
        byte number = 0;
        byte digit;
        byte rank = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            char letter = input.charAt(i);
            switch (letter) {
                case '0':
                    digit = 0;
                    break;
                case '1':
                    digit = 1;
                    break;
                case '2':
                    digit = 2;
                    break;
                case '3':
                    digit = 3;
                    break;
                case '4':
                    digit = 4;
                    break;
                case '5':
                    digit = 5;
                    break;
                case '6':
                    digit = 6;
                    break;
                case '7':
                    digit = 7;
                    break;
                case '8':
                    digit = 8;
                    break;
                default:
                    digit = 9;
                    break;

            }
            number += (byte) (digit * rank);
            rank *= 10;


        }
        if (isNegative) {
            number *= -1;
        }
        return number;

    }
}
