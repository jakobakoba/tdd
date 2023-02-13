//package com.example.middleinterview;
//
//import static org.junit.Assert.*;
//
//import androidx.annotation.NonNull;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class ParserTest {
//
//    Parser parser;
//
//
//    @Before
//    public void setUp(){
//        parser = new BaseParser();
//    }
//
//    @Test
//    public void parse() {
//        String data = "123\ntrue\napple\nm";
//
//        Parser parser = new BaseParser();
//        List<Object> expected = new ArrayList<>();
//        byte e = 123;
//        expected.add(e);
//        expected.add(true);
//        expected.add("apple");
//        expected.add('m');
//        byte negative = -54;
//        expected.add(negative);
//
//        List<Object> actual = parser.parse(data);
//
//        for (int i = 0; i < expected.size() ; i ++ ) {
//            assertEquals(expected.get(i), actual.get(i));
//        }
//    }
//    @Test
//    public void parseOther (){
//        String data = "1.55\n32000\n100000\n3000000000\n340282346638528859811704183484516925445.1000000000000000";
//
//        List<Object> expected = list(1.55f,(short)32000, -100000, 3000000000L, 340282346638528859811704183484516925445.1000000000000000);
//
//        List<Object> actual = parser.parse(data);
//
//        for (int i = 0; i < expected.size(); i ++){
//            assertEquals(expected.get(i), actual.get(i));
//        }
//
//    }
//    private static List<Object> list(Object... objects){
//        List<Object> result = new ArrayList<>();
//
//        Collections.addAll(result,objects);
//
//        return result;
//
//
//
//    }
//
//}