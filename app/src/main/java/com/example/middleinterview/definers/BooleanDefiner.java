package com.example.middleinterview.definers;

import androidx.annotation.NonNull;

public interface BooleanDefiner extends Definer {
    boolean isBoolean(String input);


    class Base implements BooleanDefiner {

        @Override
        public boolean isType(@NonNull String input) {
            return isBoolean(input);
        }

        @Override
        public boolean isBoolean(String input) {
            return "true".equals(input) || "false".equals(input);
        }
    }
}
