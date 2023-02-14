package com.example.middleinterview.parsers;

import static org.junit.Assert.assertEquals;

import com.example.middleinterview.MyPair;
import com.example.middleinterview.definers.BooleanDefiner;
import com.example.middleinterview.definers.ByteDefiner;
import com.example.middleinterview.definers.CharDefiner;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BaseParserTest {
    @Test
    public void charAndBoolean() {
        List<MyPair> parsersAndDefiners = new ArrayList<>();
        parsersAndDefiners.add(new MyPair(new BooleanParser(), new BooleanDefiner.Base()));
        parsersAndDefiners.add(new MyPair(new CharParser(), new CharDefiner.Base()));
        parsersAndDefiners.add(new MyPair(new ByteParser(), new ByteDefiner.Base()));
        BaseParser baseParser = new BaseParser("\n", parsersAndDefiners);

        String input = "true\nu\nfalse\nz\n&\n128\n127\n-99\n0\n-1";

        List<Object> expected = new ArrayList<>(5);
        expected.add(true);
        expected.add('u');
        expected.add(false);
        expected.add('z');
        expected.add('&');
        expected.add((byte) -128);
        expected.add((byte) 127);
        expected.add((byte) -99);
        expected.add((byte) 0);
        expected.add((byte) -1);


        List<Object> actual = baseParser.parse(input);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }


    }


}