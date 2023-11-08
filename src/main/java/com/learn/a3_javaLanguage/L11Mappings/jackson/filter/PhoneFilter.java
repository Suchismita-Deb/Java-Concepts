package com.learn.a3_javaLanguage.L11Mappings.jackson.filter;

import java.util.regex.Pattern;

public class PhoneFilter {

    private static Pattern phonePattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoked PhoneFilter");

        if (obj == null || !(obj instanceof String)) {
            return false;
        }
        //phone must match the regex pattern
        return !phonePattern.matcher(obj.toString()).matches();
    }
}