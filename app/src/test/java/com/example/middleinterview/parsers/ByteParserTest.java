package com.example.middleinterview.parsers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ByteParserTest {
    @Test
    public void testParser() {
        ByteParser byteParser = new ByteParser();

        List<String> actuals = new ArrayList<>();
        actuals.add("-128");
        actuals.add("127");
        actuals.add("-99");
        actuals.add("99");
        actuals.add("0");
        actuals.add("-1");

        int length = actuals.size();

        List<Byte> expected = new ArrayList<>(length);
        expected.add((byte) -128);
        expected.add((byte) 127);
        expected.add((byte) -99);
        expected.add((byte) 99);
        expected.add((byte) 0);
        expected.add((byte) -1);

        Byte currentByte;
        for (int i = 0; i < length; i++) {
            currentByte = byteParser.parse(actuals.get(i));
            assertEquals(expected.get(i), currentByte);

        }
    }


}