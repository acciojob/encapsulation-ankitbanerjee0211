package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        // rw.name = "Ankit";
        // System.out.println(rw.name);

        // Error Message:
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The field RWOnly.name is not visible

        // at com.driver.Main.main(Main.java:6)

        rw.setName("Ankit");
        System.out.println(rw.getName());
    }
}
