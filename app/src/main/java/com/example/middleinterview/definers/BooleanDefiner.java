package com.example.middleinterview.definers;

public interface BooleanDefiner {
    boolean isBoolean(String input);

    class Base implements BooleanDefiner {

        @Override
        public boolean isBoolean(String input) {
            return "true".equals(input) || "false".equals(input);
        }
    }
}
