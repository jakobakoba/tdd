package com.example.middleinterview.definers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ByteDefinerTest {
    private final ByteDefiner byteDefiner = new ByteDefiner.Base();

    @Test
    public void checkByte_positive() {
        boolean expected = true;
        List<String> positive = new ArrayList<>();
        positive.add("-128");
        positive.add("127");
        positive.add("0");

        boolean actual;
        for (String number : positive) {
            actual = byteDefiner.isByte(number);
            assertEquals(expected, actual);

        }
    }

    @Test
    public void checkByte_negative() {
        boolean expected = false;

        List<String> negative = new ArrayList<>();
        negative.add("-129");
        negative.add("128");
        negative.add("");
        negative.add("q");
        negative.add("%#@!");
        negative.add("-");
        boolean actual;
        for (String number : negative) {
            actual = byteDefiner.isByte(number);
            assertEquals(expected, actual);

        }

    }

}