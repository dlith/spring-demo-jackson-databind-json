package com.dzmitry;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class MainLiteDriver {

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println(student);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
