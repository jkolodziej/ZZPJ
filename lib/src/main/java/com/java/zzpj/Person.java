package com.java.zzpj;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    String name;
    String lastName;

    public void hello() {
        System.out.println("Hello, I'm " + name + " " + lastName);
    }
}
