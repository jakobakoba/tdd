package com.example.middleinterview;

import static org.junit.Assert.assertEquals;

import com.example.middleinterview.definers.BooleanDefiner;

import org.junit.Test;

public class BooleanDefinerTest {

    @Test
    public void checkTrue() {
        BooleanDefiner booleanDefiner = new BooleanDefiner.Base();
        boolean expected = true;
        boolean actual = booleanDefiner.isBoolean("true");

        assertEquals(expected, actual);

        actual = booleanDefiner.isBoolean("false");
        assertEquals(expected, actual);
    }

    @Test
    public void checkFalse() {
        BooleanDefiner booleanDefiner = new BooleanDefiner.Base();
        boolean expected = false;

        boolean actual = booleanDefiner.isBoolean("trueman");

        assertEquals(expected, actual);

    }

}