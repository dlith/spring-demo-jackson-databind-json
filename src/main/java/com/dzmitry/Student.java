package com.dzmitry;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;


}
