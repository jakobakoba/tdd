package com.example.middleinterview;

import androidx.annotation.NonNull;

import com.example.middleinterview.definers.Definer;
import com.example.middleinterview.parsers.TypeParser;

public class MyPair implements TypeParser<Object>, Definer {
    private final TypeParser<Object> typeParser;
    private final Definer definer;


    public MyPair(TypeParser<Object> typeParser, Definer definer) {
        this.typeParser = typeParser;
        this.definer = definer;
    }

    @Override
    public boolean isType(@NonNull String input) {
        return definer.isType(input);
    }

    @Override
    public Object parse(String input) {
        return typeParser.parse(input);
    }
}
