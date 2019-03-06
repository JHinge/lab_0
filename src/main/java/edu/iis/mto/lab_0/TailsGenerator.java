package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return Collections.emptyList();

        }
        List<String> words = new ArrayList<>(value.length());
        for (int i = 0; i < value.length(); i++) {
            words.add(value.substring(i));
        }
        words.add("");
        return words;
    }

}
