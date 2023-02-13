package com.example.middleinterview.definers;

import androidx.annotation.NonNull;

public interface ByteDefiner {
    public boolean isByte(@NonNull String input);

    class Base implements ByteDefiner {
        @Override
        public boolean isByte(@NonNull String input) {

            if (input.isEmpty() || input.length() > 4) {
                return false;
            }

            boolean isNegative = false;

            if (input.charAt(0) == '-') {
                isNegative = true;
                input = input.substring(1);

            }
            if (input.isEmpty()) {
                return false;
            }

            if ((input.length() == 3) && !(input.charAt(0) > '1') && !(input.charAt(1) > '2')) {
                if (isNegative) {
                    return input.charAt(2) <= '8';
                } else {
                    return input.charAt(2) <= '7';
                }
            }
            if (input.length() == 2) {
                for (int i = 0; i < 2; i++) {
                    if (!isDigit(input.charAt(i))) {
                        return false;
                    }
                }
            } else {
                return (isDigit(input.charAt(0)));
            }
            return true;
        }

        private boolean isDigit(char digit) {
            return digit >= '0' && digit < '9';

        }
    }
}
