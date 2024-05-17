package com.pluralsight;

public class NameFormatterDriver {
    public static void main(String[] args) {
        System.out.println(NameFormatter.format(
                "Dr. Mel B Johnson, PHD"));
        System.out.println(NameFormatter.format(
                "Mel B Johnson, phD"));
        System.out.println(NameFormatter.format(
                "Mel Johnson"));

    }
}
