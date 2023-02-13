package com.example.middleinterview.parsers;


import androidx.annotation.NonNull;

import java.util.List;

public class BaseParser implements Parser {

    private String splitter;

    public BaseParser(String splitter) {
        this.splitter = splitter;
    }

    @NonNull
    @Override
    public List<Object> parse(@NonNull String data) {
        String[] splittedData = data.split(splitter);
        for (int i = 0; i < splittedData.length; i++) {
            if (splittedData[i].startsWith("-")) {

            }

        }
        return null;
    }
}
