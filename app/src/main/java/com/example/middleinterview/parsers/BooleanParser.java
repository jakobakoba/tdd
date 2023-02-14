package com.example.middleinterview.parsers;

import androidx.annotation.NonNull;

public class BooleanParser implements TypeParser<Object> {


    @Override
    public Boolean parse(@NonNull String input) {
        return input.equals("true");
    }
}
