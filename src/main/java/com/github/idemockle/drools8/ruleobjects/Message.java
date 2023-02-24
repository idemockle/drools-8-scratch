package com.github.idemockle.drools8.ruleobjects;

import lombok.Data;
import lombok.NonNull;

@Data
public class Message {
    @NonNull private String name;
    @NonNull private String text;

}
