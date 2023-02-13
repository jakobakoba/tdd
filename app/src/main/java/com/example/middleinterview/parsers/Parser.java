package com.example.middleinterview.parsers;

import androidx.annotation.NonNull;

import java.util.List;

interface Parser {
    @NonNull
    List<Object> parse(@NonNull String data);
}
