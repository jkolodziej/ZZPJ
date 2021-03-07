package com.java.zzpj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App
{
    public static void main( String[] args ){

        Person person = new Person();

        Properties properties = new Properties();
        String filePath = "config.properties";
        try (InputStream resourceAsStream = App.class.getClassLoader().getResourceAsStream(filePath)) {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }

        person.setName(properties.getProperty("firstName"));
        person.setLastName(properties.getProperty("lastName"));

        person.hello();
    }
}
