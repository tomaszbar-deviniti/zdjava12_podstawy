package com.thobho.string;

import java.nio.charset.Charset;

public class StringDemo {
    public static void main(String[] args) {

        System.out.println("Default Charset=" + Charset.defaultCharset());



        byte[] test = {66, 66, 66};

        String testString = new String(test);


        int i = testString.codePointAt(1);



    }
}
