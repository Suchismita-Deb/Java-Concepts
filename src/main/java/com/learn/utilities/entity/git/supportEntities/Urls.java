package com.learn.utilities.entity.git.supportEntities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "GitHub"
})
@Generated("jsonschema2pojo")
public class Urls {

    @JsonProperty("GitHub")
    public String gitHub;

}