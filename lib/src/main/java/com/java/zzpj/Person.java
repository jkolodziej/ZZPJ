package com.java.zzpj;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    String name;

    public void hello() {
        System.out.println("Hello, I'm " + name);
    }
}
