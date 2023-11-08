package com.learn.a3_javaLanguage.L11Mappings.jackson.filter;

import com.learn.a3_javaLanguage.L11Mappings.jackson.model.Address;

import java.util.List;

public class EmptyListFilter {
    @Override
    public boolean equals(Object obj) {
        System.out.println("Filter running ??????????????");
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        //Exclusion condition : if all the  fields of class Address are null, Exclude the object
        List<Address> address = (List) obj;//Not possible
        System.out.println(address);

        return  false;//if equals method returns true -> value is excluded (filtered out);

    }
}
