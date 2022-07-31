package com.company;

import java.util.Scanner;

class Cylinder {
    private final float radius;
    private final float length;

    Cylinder(float kRadius, float kLength) {
        this.radius = kRadius;
        this.length = kLength;
    }

    public float getArea(float kRadius) {
        return this.radius * this.radius;
    }

    public float getVolume() {
        float area = getArea(this.radius);
        return area * this.length;
    }
}

class Restaurant {
    private final int age;

    Restaurant(int age) {
        this.age = age;
    }

    public void getAdvice() {
        //This is an example, not sure of the advice to give
        if (this.age < 18) {
            System.out.println("Provide them menu with soft drinks only.");
        } else {
            System.out.println("Provide them with full course menu.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner cylinderScanner = new Scanner(System.in);
        float length;
        float radius;
        float volume;
        System.out.println("Enter the length of the cylinder: \n");
        length = cylinderScanner.nextFloat();
        System.out.println("Enter the radius of the cylinder: \n");
        radius = cylinderScanner.nextFloat();
        Cylinder newCylinder = new Cylinder(radius, length);
        volume = newCylinder.getVolume();

        System.out.println("The volume of cylinder of length " + length + " and radius of " + radius + " is: " + volume + ".");

        Restaurant newClient = new Restaurant(12);
        newClient.getAdvice();
    }
}
