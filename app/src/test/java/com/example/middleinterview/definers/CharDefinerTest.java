package com.example.middleinterview.definers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CharDefinerTest {

    CharDefiner charDefiner = new CharDefiner.Base();

    @Test
    public void checkChar_positive() {

        boolean expected = true;

        List<String> correct = new ArrayList<>();
        correct.add("a");
        correct.add("&");
        boolean actual;

        for (int i = 0; i < correct.size(); i++) {
            actual = charDefiner.isChar(correct.get(i));

            assertEquals(expected, actual);

        }


    }

    @Test
    public void checkChar_negative() {
        boolean expected = false;


        List<String> incorrect = new ArrayList<>();
        incorrect.add("qwe");
        incorrect.add("");
        incorrect.add("1");
        incorrect.add("12");
        incorrect.add("0");
        incorrect.add("9");

        boolean actual;
        for (int i = 0; i < incorrect.size(); i++) {
            actual = charDefiner.isChar(incorrect.get(i));

            assertEquals(expected, actual);

        }


    }

}