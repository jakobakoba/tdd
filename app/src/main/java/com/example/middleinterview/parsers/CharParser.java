package com.example.middleinterview.parsers;

public class CharParser implements TypeParser<Character> {

    @Override
    public Character parse(String input) {
        return input.charAt(0);
    }
}
