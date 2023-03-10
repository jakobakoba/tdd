package com.example.middleinterview.definers;

import androidx.annotation.NonNull;

public interface CharDefiner extends Definer {
    public boolean isChar(@NonNull String input);

    class Base implements CharDefiner {

        @Override
        public boolean isType(@NonNull String input) {
            return isChar(input);
        }

        @Override
        public boolean isChar(@NonNull String input) {
            return input.length() == 1 && !(input.charAt(0) >= '0' && input.charAt(0) <= '9');
        }
    }
}

