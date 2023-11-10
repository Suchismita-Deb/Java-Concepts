package com.learn.designPatterns.creational.builder.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class DemoBuilder {
    private final String name;
    private final String email;
    private final String address;
    private final Integer age;
    private final String nameOfMother;//Optional, if the person is orphan
}
