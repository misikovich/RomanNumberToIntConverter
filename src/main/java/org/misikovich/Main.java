package org.misikovich;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RomanConverter romanConverter = new RomanConverter();
        List<String> romanSequence = List.of("III", "LVIII", "MCMXCIV");
        romanSequence.forEach(s -> System.out.println(s + " - " + romanConverter.convertToInteger(s)));
    }
}