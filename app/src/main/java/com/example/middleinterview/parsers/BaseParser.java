package com.example.middleinterview.parsers;


import androidx.annotation.NonNull;

import com.example.middleinterview.MyPair;

import java.util.ArrayList;
import java.util.List;

public class BaseParser implements Parser {

    private String splitter;
    private final List<MyPair> parsersAndDefiners;

    public BaseParser(String splitter, List<MyPair> parsersAndDefiners) {
        this.splitter = splitter;
        this.parsersAndDefiners = parsersAndDefiners;
    }


    @NonNull
    @Override
    public List<Object> parse(@NonNull String data) {

        List<Object> result = new ArrayList<>();

        String[] splittedData = data.split(splitter);
        for (String s : splittedData) {
            for (MyPair parserAndDefiner : parsersAndDefiners) {
                if (parserAndDefiner.isType(s)) {
                    result.add(parserAndDefiner.parse(s));
                    break;
                }

            }


        }
        return result;
    }
}
