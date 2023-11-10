package com.teach.a3_javaLanguage.L11Mappings.jackson.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.teach.a3_javaLanguage.L11Mappings.jackson.filter.PhoneFilter;
import com.teach.a3_javaLanguage.L11Mappings.jackson.filter.DateOfBirthFilter;
import com.teach.a3_javaLanguage.L11Mappings.jackson.filter.EmptyListFilter;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Employee {
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateOfBirth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = DateOfBirthFilter.class)
    private Date dob;
    @JsonProperty("phones")
    @JsonInclude(content = JsonInclude.Include.CUSTOM, contentFilter = PhoneFilter.class)
    private Map<String, String> phones;
    @JsonProperty("addresses")
    @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = EmptyListFilter.class)
    private List<Address> addresses;

}